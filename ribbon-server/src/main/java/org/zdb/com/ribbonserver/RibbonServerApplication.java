package org.zdb.com.ribbonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 负载均衡微服务
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 13:11:40
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonServerApplication {
	/**
	 * 负载均衡的模板
	 * @return
     */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	/**
	 * @param args the input arguments
	 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
	 * @date :2017-08-07 13:11:40
	 */
	public static void main(String[] args) {
		SpringApplication.run(RibbonServerApplication.class, args);
	}
}
