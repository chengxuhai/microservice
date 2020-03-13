package demo.microservice.feign;

import demo.microservice.entity.Dept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@Slf4j
public class DeptFeignClientFallback implements DeptFeignClient {

    public List<Dept> list() {
        log.error("服务降级处理");
        return Collections.emptyList();
    }
}
