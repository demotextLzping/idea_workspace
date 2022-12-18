package com.lzp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author： LZPing
 * @date： 2022-11-05 15:15
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private String petName;
    private String petType;
}
