package com.dragon.xiaomi.goods.controller;

import com.dragon.xiaomi.goods.pojo.Goods;
import com.dragon.xiaomi.goods.pojo.GoodsType;
import com.dragon.xiaomi.goods.service.GoodsService;
import com.dragon.xiaomi.utils.TextUtils;
import com.dragon.xiaomi.vo.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by jackiechan on 10/16/18/7:22 PM
 *
 * @Author jackiechan
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/getgoodstypelist")
    @ResponseBody
    public List<GoodsType> getGoodsTypeList() {
        List<GoodsType> goodsTypelList = goodsService.getGoodsTypeList();
        return goodsTypelList;
    }

    @RequestMapping("/getgoodsbytypeid")
    public String getGoodsByTypeId(Integer typeId, Integer pageNum, Integer pageSize, Model model) {
        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 4 : pageSize;
        PageBean pageBean = goodsService.getGoodsByTypeId(typeId, pageNum, pageSize);
        model.addAttribute("pageBean", pageBean);
        model.addAttribute("typeId", typeId);
        return "/goodsList";
    }

    /**
     * 根据商品id查询商品信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/getgoodsdetailbyid")
    public String getGoodsDetailById(Integer id, Model model) {
        Goods goods=goodsService.getGoodsDetailById(id);
        model.addAttribute("goods", goods);
        return "/goodsDetail";
    }

    @RequestMapping("/searchgoods")
    public String searchGoods(HttpServletRequest request,Model model) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String goodsname = request.getParameter("goodsname");
        if(TextUtils.empty(goodsname)){
            return "/goodssearch";
        }
        List<Goods> list=goodsService.searchByName(goodsname);
        model.addAttribute("list",list);
        return "/goodssearch";
    }


}
