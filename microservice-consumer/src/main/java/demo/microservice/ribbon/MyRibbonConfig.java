package demo.microservice.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRibbonConfig {

    @Bean
    public IRule rule() {
        // 使用随机策略
        return new RandomRule();
    }
}
