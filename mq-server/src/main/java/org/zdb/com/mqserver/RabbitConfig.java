package org.zdb.com.mqserver;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 消息的配置中心
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
@Configuration
public class RabbitConfig {
    /**
     * 创建一个队列为hello的队列
     * @return
     */
    @Bean
    public Queue getQueue(){
        return new Queue("hello");
    }
}
