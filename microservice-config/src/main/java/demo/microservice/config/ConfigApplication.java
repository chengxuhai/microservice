package demo.microservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class);
    }

    public void run(String... args) throws Exception {
        System.out.println("config server 启动成功");
    }
}
