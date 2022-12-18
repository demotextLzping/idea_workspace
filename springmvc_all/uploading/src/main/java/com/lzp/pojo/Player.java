package com.lzp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author： LZPing
 * @date： 2022-11-10 09:26
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private String nickname;
    private String photo;
    private String fileType;
}
