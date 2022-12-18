package com.lzp.mapper;

import com.lzp.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: LZPing
 * @date: 2022-12-07 15:29
 * @Description
 */
@Mapper
public interface UserMapper {
    User findById(Integer id);
}
