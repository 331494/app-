package com.jbit.server;

import com.jbit.entity.DevUser;
import com.jbit.mapper.DevUserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class DevUserserver {

    @Resource
    private DevUserMapper devUserMapper;

//    用户登录
    public DevUser queryLogin(String devcode, String devpassword){
     DevUser devUser=new DevUser();
     devUser.setDevcode(devcode);
     devUser.setDevpassword(devpassword);
     return devUserMapper.selectOne(devUser);
    }

}
