package com.lzp.mapper;

import com.lzp.pojo.Users;

import java.util.List;

public interface UsersMapper {
//    根据用户编号，查询该用户下，所有的订单，订单详情，商品信息
    Users selectAll(int uid) throws Exception;

}