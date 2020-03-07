package demo.microservice.eureka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class);
    }

    public void run(String... args) throws Exception {
        System.out.println("eureka server 启动成功");
    }
}
