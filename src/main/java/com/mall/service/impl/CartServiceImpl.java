package com.mall.service.impl;

import com.mall.common.Constant;
import com.mall.common.ServerResponse;
import com.mall.dao.CartMapper;
import com.mall.pojo.Cart;
import com.mall.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImpl implements ICartService {

    @Autowired
    private CartMapper cartMapper;

    public ServerResponse add(Integer userId, Integer productId, Integer count) {
        Cart cart = cartMapper.selectCartByUserIdProductId(userId, productId);
        if (null == cart) {
            // 该产品不在购物车中，需要新增该记录
            Cart newCart = new Cart();
            newCart.setQuantity(count);
            newCart.setProductId(productId);
            newCart.setUserId(userId);
            newCart.setChecked(Constant.Cart.CHECKED);
            cartMapper.insert(newCart);
        } else {
            // 该产品已经在购物车中了（数量+1即可）
            count = cart.getQuantity() + count;
            cart.setQuantity(count);
            cartMapper.updateByPrimaryKeySelective(cart);
        }

    }

}
