package com.mall.controller.portal;

import com.mall.common.Constant;
import com.mall.common.ResponseCode;
import com.mall.common.ServerResponse;
import com.mall.pojo.User;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/cart/")
public class CartController {

    @RequestMapping("add.do")
    @ResponseBody
    public ServerResponse add(HttpSession session, Integer count, Integer productId){
        User user = (User)session.getAttribute(Constant.CURRENT_USER);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), ResponseCode.NEED_LOGIN.getDesc());
        }
        return iCartService.add(user.getId(),productId,count);
    }



}
