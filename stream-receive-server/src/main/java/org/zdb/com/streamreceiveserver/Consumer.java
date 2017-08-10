package org.zdb.com.streamreceiveserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * 消费者
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@EnableBinding(Sink.class)
public class Consumer {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @ServiceActivator(inputChannel = Sink.INPUT)
    public void receive(String msg){
        logger.info("receive message:"+msg);
    }
}
