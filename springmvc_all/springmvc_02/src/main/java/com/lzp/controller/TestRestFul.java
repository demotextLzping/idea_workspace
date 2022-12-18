package com.lzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： LZPing
 * @date： 2022-11-04 16:52
 * @Description PathVariable注解和Rest风格支持的表述性状态转移
 */

@RestController
public class TestRestFul {
    @RequestMapping(value = "testRest/{id}", method = RequestMethod.PUT)
    public String testPUT(@PathVariable("id") String id) {
        System.out.println("test_PUT:" + id);
        return "staticPage";
    }
    @RequestMapping(value = "testRest/{id}", method = RequestMethod.DELETE)
    public String testDELETE(@PathVariable("id") String id) {
        System.out.println("test_DELETE:" + id);
        return "staticPage";
    }

    @RequestMapping(value = "testRest/{id}", method = RequestMethod.GET)
    public String testGET(@PathVariable("id") String id) {
        System.out.println("test_GET:" + id);
        return "staticPage";
    }

    @RequestMapping(value = "testRest/{id}", method = RequestMethod.POST)
    public String testPOST(@PathVariable("id") String id) {
        System.out.println("test_POST:" + id);
        return "staticPage";
    }
}
