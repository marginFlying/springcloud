package org.zdb.com.streamserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;

@EnableDiscoveryClient
@SpringBootApplication
@EnableBinding(Source.class)
public class StreamServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamServerApplication.class, args);
	}

}
