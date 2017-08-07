package org.zdb.com.feignserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 用于微服务之间相互调用
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 13:53:00
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignServerApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
	 * @date :2017-08-07 13:53:00
	 */
	public static void main(String[] args) {
		SpringApplication.run(FeignServerApplication.class, args);
	}
}
