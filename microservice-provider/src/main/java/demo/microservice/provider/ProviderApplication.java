package demo.microservice.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("demo.microservice.provider.dao")
public class ProviderApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class);
    }

    public void run(String... args) throws Exception {
        System.out.println("provider 启动成功");
    }
}
