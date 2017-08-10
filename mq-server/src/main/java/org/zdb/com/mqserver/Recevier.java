package org.zdb.com.mqserver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@Component
@RabbitListener(queues = "hello")
public class Recevier {
    @RabbitHandler
    public void process(String msg){
        System.out.println("销售者接受到的消息为:"+msg);
    }
}
