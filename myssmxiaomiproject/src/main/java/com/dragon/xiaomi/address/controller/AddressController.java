package com.dragon.xiaomi.address.controller;

import com.dragon.xiaomi.address.pojo.Address;
import com.dragon.xiaomi.address.service.AddressService;
import com.dragon.xiaomi.commons.annotation.LogAnnotation;
import com.dragon.xiaomi.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Administrator
 * @Date 2018/10/17 22:38
 * @Classname AddressController
 */
@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/getaddress")
    @LogAnnotation(opertionName = "获取所有地址",operationType = "getAddress")
    public String getAddress(Model model,HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        List<Address> addressList=addressService.getAddressList(user.getId());
        model.addAttribute("addList",addressList);
        return "/self_info";
    }

    @RequestMapping("/defaultaddress")
    @LogAnnotation(opertionName = "设置为默认地址",operationType = "defaultAddress")
    public String defaultAddress(Integer id,Integer level){
        addressService.defautAdd(id,level);
        return "forward:getaddress.action";
    }

    @RequestMapping("/addaddress")
    @LogAnnotation(opertionName = "添加地址",operationType = "addAddress")
    public String addAddress(HttpServletRequest request){

        User user = (User) request.getSession().getAttribute("user");

        String name=request.getParameter("name");
        String phone=request.getParameter("phone");
        String detail=request.getParameter("detail");

        System.err.println(name+"---"+phone+"---"+detail);

        addressService.addAddress(new Address(0,detail,name,phone,user.getId(),0));

        return "forward:getaddress.action";
    }

    @RequestMapping("/updateaddress")
    @LogAnnotation(opertionName = "修改地址",operationType = "updateAddress")
    public String updateAddress(Address address,HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        address.setUid(user.getId());
        addressService.updateAddress(address);
        return "forward:getaddress.action";
    }

    @RequestMapping("/deleteaddress")
    @LogAnnotation(opertionName = "删除地址",operationType = "deleteAddress")
    public String deleteAddress(HttpServletRequest request){
        String id = request.getParameter("id");
        addressService.deleteAddress(id);

        return "forward:getaddress.action";
    }

}
