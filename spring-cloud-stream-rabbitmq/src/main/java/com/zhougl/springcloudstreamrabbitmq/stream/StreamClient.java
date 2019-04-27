package com.zhougl.springcloudstreamrabbitmq.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author zhougl
 * 2019/2/1
 **/
public interface StreamClient {

    String OUT_MESSAGE = "OUTMessage";
    String IN_MESSAGE = "INMessage";

    @Input(StreamClient.IN_MESSAGE)
    SubscribableChannel input();

    @Output(StreamClient.OUT_MESSAGE)
    MessageChannel output();
}
