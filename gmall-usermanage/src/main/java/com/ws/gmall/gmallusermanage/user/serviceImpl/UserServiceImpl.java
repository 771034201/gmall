package com.ws.gmall.gmallusermanage.user.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.bean.UserAddress;
import com.gmall.bean.UserInfo;
import com.ws.gmall.gmallusermanage.user.mapper.UserAddressMapper;
import com.ws.gmall.gmallusermanage.user.mapper.UserMapper;
import com.ws.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> getUserInfoList() {
        List<UserInfo> userInfos = userMapper.selectAll();
        return userInfos;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // 调用mapper
        // select * from userAddress where userId=?
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return    userAddressMapper.select(userAddress);
    }

}
