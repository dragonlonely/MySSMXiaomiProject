package com.dragon.xiaomi.cart.service.impl;

import com.dragon.xiaomi.cart.pojo.Cart;
import com.dragon.xiaomi.cart.service.CartService;
import com.dragon.xiaomi.mapper.CartMapper;
import com.dragon.xiaomi.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @Date 2018/10/19 14:11
 * @Classname CartServiceImpl
 */
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public Cart findByUserIdAndGoodsId(int id, int pid) {
        return cartMapper.findByUserIdAndGoodsId(id,pid);
    }

    @Override
    public void add(Cart cart) {
        cartMapper.add(cart);
    }

    @Override
    public void update(Cart cart) {
        cartMapper.update(cart);
    }

    @Override
    public List<Cart> getCartById(int id) {

        List<Cart> carts = cartMapper.getCartById(id);
        for(Cart cart:carts){
            cart.setGoods(goodsMapper.findById(cart.getPid()));
        }
        return carts;
    }

    @Override
    public void remove(int id, int goodsId) {
        cartMapper.remove(id,goodsId);
    }

    @Override
    public void clear(int id) {
        cartMapper.clear(id);
    }
}
