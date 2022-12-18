package com.lzp.mapper;

import com.lzp.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-20 20:39
 * @Description
 */
@Mapper
public interface UserMapper {
    List<User> selectAll();
}
