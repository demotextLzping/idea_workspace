package com.lzp.service;

import com.lzp.pojo.Player;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-10 09:28
 * @Description
 */

public interface PlayerService {
    int addPlayer(Player player);

    List<Player> getAllPlayer();
}
