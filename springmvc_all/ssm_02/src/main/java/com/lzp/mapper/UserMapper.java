package com.lzp.mapper;

import com.lzp.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-06 21:30
 * @Description
 */
public interface UserMapper {
    User findUser(@Param("name")String name,@Param("pwd") String pwd);

}
