package com.testenum4;

/**
 * @author lzp
 * @version 1.0
 * @data 2022/7/15 10:55
 */
public enum Season implements TestInterface {
    SPRING{
        @Override
        public void show() {
       System.out.println("这是一个春天");
        }
    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("这是一个夏天");
        }
    },
    AUTUMN{
        @Override
        public void show() {
            System.out.println("这是一个秋天");
        }
    },
    WINTER{
        @Override
        public void show() {
            System.out.println("这是一个冬天");
        }
    };


}
