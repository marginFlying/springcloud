package org.zdb.com.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * springcloud的微服务，可以通过配置中心进行注册
 *
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 11:52:41
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

	/**
	 * eureka-client的启动器
	 * @param args the input arguments
	 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
	 * @date :2017-08-07 11:52:41
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
