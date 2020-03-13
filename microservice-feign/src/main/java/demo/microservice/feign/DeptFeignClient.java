package demo.microservice.feign;

import demo.microservice.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "microservice-provider", /*fallback = DeptFeignClientFallback.class,*/ fallbackFactory = DeptFeignClientFallbackFactory.class)
public interface DeptFeignClient {

    @GetMapping("/dept/list")
    List<Dept> list();
}
