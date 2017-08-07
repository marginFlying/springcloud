package org.zdb.com.orderserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 订单服务
 * 通过配置的微服务进行注册
 *
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 11:54:29
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderServerApplication {

	/**
	 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
	 * @date :2017-08-07 11:54:29
	 */
	public static void main(String[] args) {
		SpringApplication.run(OrderServerApplication.class, args);
	}
}
