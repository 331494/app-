package com.jbit;

import com.jbit.entity.DevUser;
import com.jbit.server.DevUserserver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {

    @Resource
    private DevUserserver devUserserver;

    @Test
    public  void test(){
        DevUser user = devUserserver.queryLogin("test001", "123456");
        System.out.println("user,"+user);
    }

}
