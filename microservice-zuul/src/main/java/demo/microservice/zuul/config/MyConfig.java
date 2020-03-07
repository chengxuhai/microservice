package demo.microservice.zuul.config;

import demo.microservice.zuul.filter.MyErrorFilter;
import demo.microservice.zuul.filter.MyPostFilter;
import demo.microservice.zuul.filter.MyPreFilter;
import demo.microservice.zuul.filter.MyRouteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public MyPreFilter myPreFilter() {
        return new MyPreFilter();
    }

    @Bean
    public MyRouteFilter myRouteFilter() {
        return new MyRouteFilter();
    }

    @Bean
    public MyPostFilter myPostFilter() {
        return new MyPostFilter();
    }

    @Bean
    public MyErrorFilter myErrorFilter() {
        return new MyErrorFilter();
    }
}
