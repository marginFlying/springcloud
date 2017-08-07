package org.zdb.com.hystrixserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 熔断机制的微服务
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 16:40:48
 */
@EnableCircuitBreaker
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixServerApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
	 * @date :2017-08-07 16:40:48
	 */
	public static void main(String[] args) {
		SpringApplication.run(HystrixServerApplication.class, args);
	}
}
