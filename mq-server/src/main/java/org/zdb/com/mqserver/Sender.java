package org.zdb.com.mqserver;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息的发送者
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(String msg){
        System.out.println("发送的消息为："+msg);
        rabbitTemplate.convertAndSend("hello",msg);
        System.out.println("==========消息发送完成==========");
    }
}
