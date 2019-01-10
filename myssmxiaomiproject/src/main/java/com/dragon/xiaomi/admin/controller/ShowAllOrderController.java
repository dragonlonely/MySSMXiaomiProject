package com.dragon.xiaomi.admin.controller;

import com.dragon.xiaomi.order.service.OrderService;
import com.dragon.xiaomi.user.service.UserService;
import com.dragon.xiaomi.utils.TextUtils;
import com.dragon.xiaomi.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Administrator
 * @Date 2019/1/6 17:46
 * @Classname ShowAllOrderController
 */
@Controller
@RequestMapping("/order")
public class ShowAllOrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @RequestMapping("/getallorder")
    public String getAllOrder(HttpServletRequest request) {
        List<OrderVo> orderList = orderService.getAllOrder();
        request.getSession().setAttribute("orderList", orderList);
        return "/admin/showAllOrder";
    }

    @RequestMapping("/sendOrder")
    public String sendOrder(HttpServletRequest request) {
        String orderId = request.getParameter("oid");
        orderService.updateStatus(orderId, "3");
        return "forward:getallorder.action";
    }

    @RequestMapping("/searchOrder")
    public String searchOrder(HttpServletRequest request){
        String username = request.getParameter("username");
        String status = request.getParameter("status");
        if (TextUtils.empty(username)) {
            return "用户名不能为空";
        }
        List<OrderVo> orderList=orderService.findOrderByUseridOrStatus(username,status);
        request.getSession().setAttribute("orderList", orderList);
        return "/admin/showAllOrder";
    }

}
