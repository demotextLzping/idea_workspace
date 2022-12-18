package com.lzp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author: LZPing
 * @date: 2022-12-07 15:27
 * @Description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class User {
    private Integer id;
    private String name;
    private String pwd;
}
