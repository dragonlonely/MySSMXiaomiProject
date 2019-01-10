package com.dragon.xiaomi.user.controller;

import cn.dsna.util.images.ValidateCode;
import com.dragon.xiaomi.commons.annotation.LogAnnotation;
import com.dragon.xiaomi.commons.redis.JedisClientPool;
import com.dragon.xiaomi.user.pojo.User;
import com.dragon.xiaomi.user.service.UserService;
import com.dragon.xiaomi.utils.StringUtil;
import com.dragon.xiaomi.utils.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Created by jackiechan on 10/16/18/6:49 PM
 *
 * @Author jackiechan
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private JedisClientPool jedisClientPool;

    @RequestMapping("/register")
    @LogAnnotation(opertionName = "用户注册",operationType = "register")
    public String register(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String phone = request.getParameter("phone");
        String validCode = request.getParameter("validCode");

        User user=new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setGender(gender);
        user.setPhone(phone);

        //判断手机验证码是否正确
        String phoneCode = jedisClientPool.get(phone);//从缓存中去除短信验证码
        if (validCode==null || !validCode.equals(phoneCode)) {
            return "/login";
        }

        //判断两次密码是否一致
        if (StringUtil.isEqualsIgnoreCase(password, repassword)) {
            // 代表一致
            try {
                user.setPassword(DigestUtils.md5DigestAsHex(password.getBytes()));//将原始目的密码转换成md5校验值,然后重新设置给对象
                userService.addUser(user);
                return "/login";
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return "/error/error";
    }

    @RequestMapping("/checkusername")
    @ResponseBody
    @LogAnnotation(opertionName = "检查用户是否存在",operationType = "regicheckUserNameter")
    public String checkUserName(String username) {
        int i = userService.checkUserName(username);
        return i + "";
    }

    @RequestMapping("/login")
    @LogAnnotation(opertionName = "用户登录",operationType = "login")
    public String login(HttpServletRequest request,HttpServletResponse response) throws Exception {
        // 获取数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 验证码
        String vcode = request.getParameter("vcode");

        //是否勾选自动登录
        String auto = request.getParameter("auto");

        if (TextUtils.empty(username)) {
            request.setAttribute("msg", "用户名不能为空");
            return "redirect:/login.jsp";
        }

        if (TextUtils.empty(password)) {
            request.setAttribute("msg", "密码不能为空");
            return "redirect:/login.jsp";
        }

        if (TextUtils.empty(vcode)) {
            request.setAttribute("msg", "验证码不能为空");
            return "redirect:/login.jsp";
        }
        //判断验证码是否正确
        if (!request.getSession().getAttribute("vcode").equals(vcode)) {
            request.setAttribute("msg", "验证码输入错误");
            return "redirect:/login.jsp";
        }

        //首先判断传递的用户名和密码不能为空
        password = DigestUtils.md5DigestAsHex(password.getBytes());//把密码转成md5值,因为数据库中存放的是md5值,此处我们先简单使用MD5,后面会更改
        User user = userService.findUserByUsernameAndPassword(username, password);
        if (user == null) {
            return "redirect:/login.jsp";
        }
        //放到session中
        request.getSession().setAttribute("user",user);

        if(auto!=null){
            String userinfo=username+"#"+DigestUtils.md5DigestAsHex(password.getBytes());
            Cookie cookie=new Cookie("userinfo", URLEncoder.encode(userinfo, "UTF-8"));
            cookie.setMaxAge(60*60*24*14);
            cookie.setHttpOnly(true);
            response.addCookie(cookie);
        }

        return "redirect:/index.jsp";
    }

    @RequestMapping("/code")
    @LogAnnotation(opertionName = "生成验证码",operationType = "code")
    public void code(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ValidateCode validateCode=new ValidateCode(120, 35, 4, 20);
        String code=validateCode.getCode();
        request.getSession().setAttribute("vcode", code);
        ImageIO.write(validateCode.getBuffImg(), "jpg", response.getOutputStream());
    }

    @GetMapping("/checkCode")
    @LogAnnotation(opertionName = "验证验证码",operationType = "checkCode")
    public void checkCode(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String code = request.getParameter("code");
        String vcode = (String) request.getSession().getAttribute("vcode");
        if (code.equalsIgnoreCase(vcode)) {
            response.getWriter().write("0");
        }else{
            response.getWriter().write("1");
        }
    }

    @RequestMapping("/logout")
    @LogAnnotation(opertionName = "用户登出",operationType = "logOut")
    public String logOut(HttpServletRequest request,HttpServletResponse response){
        //删除cookie
        Cookie cookie=new Cookie("userinfo", "");
        cookie.setMaxAge(0);
        cookie.setHttpOnly(true);
        response.addCookie(cookie);

        //删除session中的user
        request.getSession().removeAttribute("user");
        request.getSession().invalidate();

        return "/login";
    }

    @RequestMapping("/modifypassword")
    @LogAnnotation(opertionName = "用户修改密码",operationType = "modifyPassword")
    public String modifyPassword(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        String password = request.getParameter("password");
        String newpassword = request.getParameter("newpassword");
        String renewpassword = request.getParameter("renewpassword");

        if (TextUtils.empty(password)) {
            request.setAttribute("msg", "原始密码不能为空");
            return "redirect:/self_show.jsp";
        }
        if (TextUtils.empty(newpassword)) {
            request.getSession().setAttribute("msg", "新密码不能为空");
            return "redirect:/self_show.jsp";
        }
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        if (!password.equals(user.getPassword())) {
            request.getSession().setAttribute("msg", "原始密码有误");
            return "redirect:/self_show.jsp";
        }
        if (!newpassword.equals(renewpassword)) {
            request.getSession().setAttribute("msg", "两次密码不一致");
            return "redirect:/self_show.jsp";
        }
        User user2 = new User(user.getId(), user.getUsername(), newpassword, user.getEmail(), user.getGender(),
                user.getFlag(), user.getRole(), user.getCode(),user.getPhone());
        userService.updatePassword(user2);

        return "redirect:/login.jsp";
    }

}
