package com.test.jdbctset1;


import org.apache.log4j.Logger;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/18 12:26
 */
public class testLog4j {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(testLog4j.class);
        logger.fatal("fatal message");
        logger.error("error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");

        //打印异常

        try{
            int i=1/0;
        }catch (Exception e){

            logger.warn("程序捕获到异常",e);
        }


    }
}
