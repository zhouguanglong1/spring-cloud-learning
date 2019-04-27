package com.zhougl.springcloudstreamrabbitmq.stream;

import com.zhougl.springcloudstreamrabbitmq.stream.bean.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author zhougl
 * 2019/2/2
 **/
@RestController
public class SendMessageController {

    @Autowired
    StreamClient streamClient;

    @GetMapping(value = "sendMessage")
    public void process(){
        String message = "now "+new Date();
        Order order = new Order();
        order.setOrderId(message);
        order.setQuantity(1);
        streamClient.output().send(MessageBuilder.withPayload(order).build());
    }
}
