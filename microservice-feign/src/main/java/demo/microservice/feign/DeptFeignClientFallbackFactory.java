package demo.microservice.feign;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
@Slf4j
public class DeptFeignClientFallbackFactory implements FallbackFactory<DeptFeignClient> {

    public DeptFeignClient create(Throwable throwable) {
        return () -> {
            log.error("服务降级处理");
            return Collections.emptyList();
        };
    }
}
