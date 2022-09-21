package com.test.thread6;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/28 10:27
 */
public class TestRandomNum implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }
}
