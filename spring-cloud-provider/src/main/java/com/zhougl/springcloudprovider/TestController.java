package com.zhougl.springcloudprovider;

import com.zhougl.springcloudprovider.entity.RequestVO;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("test1")
    public String test1(@RequestBody RequestVO requestVO){
        return "hello," + requestVO.getAddress() + " " + requestVO.getName();
    }
}
