package demo.microservice.consumer.controller;

import demo.microservice.entity.Dept;
import demo.microservice.feign.DeptFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DeptFeignClient deptFeignClient;

//    @GetMapping("/list")
//    public List<Dept> list() {
//        return restTemplate.getForObject("http://localhost:8081/dept/list", List.class);
//    }

//    @GetMapping("list")
//    @HystrixCommand(fallbackMethod = "fallback")
//    public List<Dept> list() {
//        return restTemplate.getForObject("http://microservice-provider/dept/list", List.class);
//    }

//    private List<Dept> fallback() {
//        return Collections.emptyList();
//    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptFeignClient.list();
    }

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/port")
    public String port() {
        ServiceInstance instance = this.loadBalancerClient.choose("microservice-provider");
        return instance.getServiceId() + ": " + instance.getHost() + ": " + instance.getPort();
    }
}
