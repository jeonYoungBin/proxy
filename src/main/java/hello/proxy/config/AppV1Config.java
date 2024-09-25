package hello.proxy.config;

import hello.proxy.app.v1.OrderRepositoryV1;
import hello.proxy.app.v1.OrderRepositoryV1Impl;
import hello.proxy.app.v1.OrderServiceV1;
import hello.proxy.app.v1.OrderServiceV1Impl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppV1Config {
    /*@Bean
    public OrderControllerV1 orderProxyControllerV1() {
        return new OrderControllerV1Impl(orderProxyServiceV1());
    }*/

    @Bean
    public OrderServiceV1 orderProxyServiceV1() {
        return new OrderServiceV1Impl(orderProxyRepositoryV1());
    }

    @Bean
    public OrderRepositoryV1 orderProxyRepositoryV1() {
        return new OrderRepositoryV1Impl();
    }
}
