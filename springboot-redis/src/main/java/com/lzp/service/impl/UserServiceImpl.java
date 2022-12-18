package com.lzp.service.impl;

import com.lzp.mapper.UserMapper;
import com.lzp.pojo.User;
import com.lzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author: LZPing
 * @date: 2022-12-07 15:32
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @Override
    public User findById(Integer id) {


        String key ="user:"+id;
        if(redisTemplate.hasKey(key)){
            System.out.println("执行缓存");
            redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<User>(User.class));
            User user=(User) redisTemplate.opsForValue().get(key);
            return user;
        }
        System.out.println("执行sql");
        User user = userMapper.findById(id);
        redisTemplate.opsForValue().set(key,user);
        return user;
    }
}
