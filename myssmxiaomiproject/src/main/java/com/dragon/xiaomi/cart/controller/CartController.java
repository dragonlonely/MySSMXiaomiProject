package com.dragon.xiaomi.cart.controller;

import com.dragon.xiaomi.cart.pojo.Cart;
import com.dragon.xiaomi.cart.service.CartService;
import com.dragon.xiaomi.goods.pojo.Goods;
import com.dragon.xiaomi.goods.service.GoodsService;
import com.dragon.xiaomi.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Administrator
 * @Date 2018/10/19 13:06
 * @Classname CartController
 */
@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/addcart")
    public String addCart(HttpServletRequest request){

        User user = (User) request.getSession().getAttribute("user");
        String _goodsId = request.getParameter("goodsId");
        int goodsId=Integer.parseInt(_goodsId);

        Cart cart=cartService.findByUserIdAndGoodsId(user.getId(),goodsId);

        System.out.println("===>"+cart);
        //获取商品
        Goods goods=goodsService.findById(goodsId);

        if(cart==null){
            //向购物车中加入数据
            cartService.add(new Cart(user.getId(),goodsId,1,goods.getPrice(),null));
        }else{
            //更新
            //更新数量
            cart.setNum(cart.getNum()+1);
            cart.setMoney(cart.getNum()*goods.getPrice());
            cartService.update(cart);
        }

        return "/cartSuccess";
    }

    @RequestMapping("/getcart")
    public String getCart(HttpServletRequest request, Model model){
        User user = (User) request.getSession().getAttribute("user");
        List<Cart> carts=cartService.getCartById(user.getId());
        model.addAttribute("carts",carts);
        return "/cart";
    }

    @RequestMapping("/addcartajax")
    @ResponseBody
    public void addCartAjax(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        int goodsId=Integer.parseInt(request.getParameter("goodsId"));
        int number=Integer.parseInt(request.getParameter("number"));

        Cart cart=cartService.findByUserIdAndGoodsId(user.getId(),goodsId);
        //获取商品
        Goods goods=goodsService.findById(goodsId);

        if(number!=0){
            cart.setNum(cart.getNum()+number);
            cart.setMoney(cart.getNum()*goods.getPrice());
            cartService.update(cart);
        }
        else{
            cartService.remove(user.getId(),goodsId);
        }
    }

    @RequestMapping("/clearcartajax")
    @ResponseBody
    public void clearCartAjax(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        cartService.clear(user.getId());
    }


}
