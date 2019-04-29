package com.zhougl.springcloudprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhougl
 * 2019/4/30
 **/
@RestController
//@RequestMapping("test")
public class TestController {

    @GetMapping("test")
    public String test(String name){
        return "hello," + name;
    }
}
