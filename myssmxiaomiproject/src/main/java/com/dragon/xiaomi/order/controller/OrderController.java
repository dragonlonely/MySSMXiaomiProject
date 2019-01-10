package com.dragon.xiaomi.order.controller;

import com.dragon.xiaomi.address.pojo.Address;
import com.dragon.xiaomi.address.service.AddressService;
import com.dragon.xiaomi.cart.pojo.Cart;
import com.dragon.xiaomi.cart.service.CartService;
import com.dragon.xiaomi.order.pojo.Order;
import com.dragon.xiaomi.order.pojo.OrderDetail;
import com.dragon.xiaomi.order.service.OrderService;
import com.dragon.xiaomi.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Administrator
 * @Date 2018/10/19 16:40
 * @Classname OrderController
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private AddressService addressService;
    @Autowired
    private CartService cartService;

    @RequestMapping("/account")
    public String account(HttpServletRequest request, Model model) throws Exception {
        request.setCharacterEncoding("UTF-8");
        User user = (User) request.getSession().getAttribute("user");

        List<Cart> carts = cartService.getCartById(user.getId());
        List<Address> addList=addressService.findByUserId(user.getId());

        model.addAttribute("carts",carts);
        model.addAttribute("addList",addList);
        return "/order";
    }

    @RequestMapping("/addorder")
    public String addOrder(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        List<Cart> carts = cartService.getCartById(user.getId());
        String _aid = request.getParameter("aid");
        int addid=Integer.parseInt(_aid);
        Order order=orderService.submitOrder(carts,addid,user.getId());
        model.addAttribute("order",order);
        return "/orderSuccess";
    }

    @RequestMapping("/getorderlist")
    public String getOrderList(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        List<Order> orders=orderService.findOrderByUserId(user.getId());
        model.addAttribute("orderList",orders);
        return "/orderList";
    }

    @RequestMapping("/getorderdetail")
    public String getOrderDetail(HttpServletRequest request,Model model){
        String oid = request.getParameter("oid");
        List<OrderDetail> orderDetails=orderService.findByOid(oid);
        Order order=orderService.findByOrderid(oid);
        Address address=addressService.findByAid(order.getAid());
        model.addAttribute("orderDetails",orderDetails);
        model.addAttribute("order",order);
        model.addAttribute("address",address);
        return "/orderDetail";
    }

    @RequestMapping("/changestatus")
    public String changeStatus(HttpServletRequest request){
        String orderId = request.getParameter("oid");
        orderService.updateStatus(orderId,"4");

        return "forward:getorderlist.action";
    }

}
