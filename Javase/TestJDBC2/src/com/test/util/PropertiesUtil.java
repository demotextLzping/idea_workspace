package com.test.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/18 11:37
 */
public class PropertiesUtil {
    private Properties properties;

    public PropertiesUtil(String path){
        properties=new Properties();
        InputStream resourceAsStream = this.getClass().getResourceAsStream(path);
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public String getProperties(String key){
        return properties.getProperty(key);
    }
}
