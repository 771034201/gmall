package com.ws.gmall.gmallusermanage.user.controller;

import com.gmall.bean.UserInfo;
import com.ws.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<UserInfo> findAll(){
        List<UserInfo> userInfoList = userService.getUserInfoList();
        return userInfoList;
    }
}
