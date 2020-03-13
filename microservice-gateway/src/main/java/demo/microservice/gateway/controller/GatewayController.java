package demo.microservice.gateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GatewayController {

    @GetMapping("/fallback")
    public String fallback() {
        log.info("enter fallback");
        return "{\"success\":false,\"msg\":\"服务异常\"}";
    }
}
