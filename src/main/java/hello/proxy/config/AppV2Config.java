package hello.proxy.config;

import hello.proxy.app.v2.OrderControllerV2;
import hello.proxy.app.v2.OrderRepositoryV2;
import hello.proxy.app.v2.OrderServiceV2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppV2Config {
    @Bean
    public OrderControllerV2 orderProxyControllerV2() {
        return new OrderControllerV2(orderProxyServiceV2());
    }

    @Bean
    public OrderServiceV2 orderProxyServiceV2() {
        return new OrderServiceV2(orderProxyRepositoryV2());
    }

    @Bean
    public OrderRepositoryV2 orderProxyRepositoryV2() {
        return new OrderRepositoryV2();
    }
}
