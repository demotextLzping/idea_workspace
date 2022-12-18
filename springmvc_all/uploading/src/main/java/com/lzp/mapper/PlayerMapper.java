package com.lzp.mapper;

import com.lzp.pojo.Player;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-10 09:28
 * @Description
 */

public interface PlayerMapper {
    int addPlayer(Player player);

    @Select("select * from player")
    List<Player> getAllPlayer();
}
