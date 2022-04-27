package com.ysmjjsy.goya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author goya
 * @create 2022-04-27 23:13
 * @Description
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
