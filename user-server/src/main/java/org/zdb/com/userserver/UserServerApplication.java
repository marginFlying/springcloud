package org.zdb.com.userserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 用户服务
 * 通过配置的微服务进行注册
 *
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 11:55:52
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
public class UserServerApplication {

	/**
	 * @param args the input arguments
	 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
	 * @date :2017-08-07 11:55:52
	 */
	public static void main(String[] args) {
		SpringApplication.run(UserServerApplication.class, args);
	}
}
