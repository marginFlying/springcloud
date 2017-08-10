package org.zdb.com.streamreceiveserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StreamReceiveServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamReceiveServerApplication.class, args);
	}
}
