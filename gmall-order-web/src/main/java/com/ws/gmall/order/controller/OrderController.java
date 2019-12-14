package com.ws.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.bean.UserAddress;
import com.ws.gmall.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Reference
    private UserService userService;

    @RequestMapping("trade")
    public List<UserAddress> getUserAddress(String userId){
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }
}
