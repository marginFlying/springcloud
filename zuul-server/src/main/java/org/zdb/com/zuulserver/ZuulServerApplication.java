package org.zdb.com.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.zdb.com.zuulserver.filter.AccessTokenFilter;
import org.zdb.com.zuulserver.filter.AuthFilter;

/**
 * 网关服务
 * 通过配置的微服务进行注册
 * 该服务的主要作用是外部系统调用微服务，为微服务提供安全的链接方式，防止微服务的接口暴露
 *
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
 * @date :2017-08-07 11:56:12
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulServerApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
	 * @date :2017-08-07 11:56:12
	 */
	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}

	/**
	 * Access token filter access token filter.
	 *
	 * @return 访问过滤器
	 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
	 * @date :2017-08-07 11:56:12
	 */
	@Bean
	public AccessTokenFilter accessTokenFilter(){
		return new AccessTokenFilter();
	}

	/**
	 * 权限过滤器
	 *
	 * @return the auth filter
	 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">zhengdb</a>
	 * @date :2017-08-07 11:56:12
	 */
	@Bean
	public AuthFilter authFilter(){
		return new AuthFilter();
	}
}
