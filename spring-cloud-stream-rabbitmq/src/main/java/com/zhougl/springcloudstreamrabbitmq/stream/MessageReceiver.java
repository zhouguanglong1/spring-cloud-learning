package com.zhougl.springcloudstreamrabbitmq.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author zhougl
 * 2019/2/1
 **/
@Component
@EnableBinding(StreamClient.class)
public class MessageReceiver {

//    @StreamListener(StreamClient.OUT_MESSAGE)
//    public void process(Object message){
//        System.out.println("receive :"+message);
//    }
}
