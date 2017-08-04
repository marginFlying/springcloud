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
 *  通过配置的微服务进行注册
 *  该服务的主要作用是外部系统调用微服务，为微服务提供安全的链接方式，防止微服务的接口暴露
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}
	@Bean
	public AccessTokenFilter accessTokenFilter(){
		return new AccessTokenFilter();
	}
	@Bean
	public AuthFilter authFilter(){
		return new AuthFilter();
	}
}
