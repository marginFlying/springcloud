package org.zdb.com.mqserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zdb.com.mqserver.consumer.MQConsumer;
import org.zdb.com.mqserver.producer.MqProducer;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqServerApplicationTests {
	/**
	 * rabbitMQ测试类
	 * @throws Exception
     */
	@Test
	public void contextLoads() throws Exception{
		MQConsumer consumer = new MQConsumer("queue");
		Thread consumerThread = new Thread(consumer);
		consumerThread.start();

		MqProducer producer = new MqProducer("queue");

		for (int i = 0; i < 100000; i++) {
			HashMap message = new HashMap();
			message.put("message number", i);
			producer.sendMessage(message);
			System.out.println("Message Number "+ i +" sent.");
		}
	}

}
