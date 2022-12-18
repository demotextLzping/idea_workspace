package com.lzp.test;

import com.lzp.pojo.User;
import com.lzp.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author： LZPing
 * @date： 2022-11-08 08:28
 * @Description
 */
//使用SpringJUnitConfig测试时，junit的版本应该是junit5，导入的依赖来应该是import org.junit.jupiter.api.Test;
@SpringJUnitConfig(locations = "classpath:applicationContext.xml")
public class TestFindUser {
    @Autowired
    private UserService userService;

    @Test
    public void testFindUser() {
        User user = userService.findUser("zhansan", "123");
        System.out.println(user);

    }
}
