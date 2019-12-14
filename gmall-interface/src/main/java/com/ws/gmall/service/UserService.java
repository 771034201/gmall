package com.ws.gmall.service;

import com.gmall.bean.UserAddress;
import com.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {

//    查询全部用户信息
    public List<UserInfo> getUserInfoList();

    //    根据用户id获取用户地址
    public List<UserAddress> getUserAddressList(String userId);
}
