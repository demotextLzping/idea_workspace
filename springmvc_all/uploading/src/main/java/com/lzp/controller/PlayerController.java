package com.lzp.controller;

import com.lzp.pojo.Player;
import com.lzp.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author： LZPing
 * @date： 2022-11-10 09:26
 * @Description
 */
@Controller
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @RequestMapping("addPlayer")
    public String addPlayer(Player player) {
        System.out.println(player);
        playerService.addPlayer(player);

        return "redirect:/showPlayer.jsp";
    }


    @ResponseBody
    @RequestMapping("getAllPlayer")
    public List<Player> getAllPlayer() {
        return playerService.getAllPlayer();
    }

}
