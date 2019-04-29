package com.zhougl.springcloudconsumer.controller;

import com.zhougl.springcloudconsumer.feign.FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhougl
 * 2019/4/30
 **/
@RestController
//@RequestMapping("test")
public class TestController {
    @Autowired
    FeignClient feignClient;

    @RequestMapping("test")
    public String test(String name){
        System.out.println(feignClient.test(name));
        return feignClient.test(name);
    }
}
