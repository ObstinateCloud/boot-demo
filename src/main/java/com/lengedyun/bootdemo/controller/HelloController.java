package com.lengedyun.bootdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("hello")
@Api(tags = "hello")
public class HelloController {

    @GetMapping("/")
    @ApiOperation("hello")
    public String hello(){
        System.out.println("received new Request at "+new Date());
        return "hello everyone now at: " + new Date();
    }
}
