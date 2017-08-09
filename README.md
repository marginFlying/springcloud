# springcloud各种基础的微服务介绍

1：eureka-server:注册中心的微服务：主要用于各个微服务的注册

2：springboot:这是springboot的原始demo

3：eureka-client:演示eureka-server对于微服务的注册（eureka-client相当于普通的微服务，在eureka-server中进行注册）

4：config-server:动态配置的微服务，主要是用于一些配置文件的管理

5：config-client:配置文件的管理中心，主要是放置一些配置文件，提供给配置中心读取配置信息

6：feign-server:内部“网关”：用于微服务之间相关调用

7：zuul-server:网关:主要用于外部系统对微服务的访问，提供一种安全的策略（有点类似于拦截器、过滤器）

8：ribbon-server:这是负载均衡的微服务：主要是用于同一服务部署集群时，提供访问服务的负载均衡

9：hystrix-server:容错纠正服务：在分布式系统中，一个服务会调用多个其他微服务，而在调用过程中很容易因为某些原因
（网络连接慢，资源紧张，阻塞等）导致某个微服务无法正常提供服务，而作为调用方应该有一种容错机制，来隔离这种异常，
从而不让一个微服务的异常影响整体的运行（分为两种容错机制：一种是直接使用Hystrix，一种是通过FeignClient）

10：spring-bus-server:该服务主要是消息总线服务：目前支持kafka和RabbitMQ两种消息中间件。（该功能暂定）

