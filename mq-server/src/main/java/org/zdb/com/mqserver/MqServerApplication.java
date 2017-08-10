package org.zdb.com.mqserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MqServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqServerApplication.class, args);
	}
}
