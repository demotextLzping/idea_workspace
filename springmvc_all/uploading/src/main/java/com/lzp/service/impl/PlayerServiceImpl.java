package com.lzp.service.impl;

import com.lzp.mapper.PlayerMapper;
import com.lzp.pojo.Player;
import com.lzp.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-06 19:14
 * @Description
 */
@Transactional
@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerMapper playerMapper;


    @Override
    public int addPlayer(Player player) {
        return playerMapper.addPlayer(player);
    }

    @Override
    public List<Player> getAllPlayer() {
        return playerMapper.getAllPlayer();
    }
}
