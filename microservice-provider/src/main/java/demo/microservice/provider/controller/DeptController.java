package demo.microservice.provider.controller;

import demo.microservice.entity.Dept;
import demo.microservice.provider.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
@Slf4j
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/list")
    public List<Dept> list() {
        log.info("port is {}", port);
        return deptService.findAll();
    }

}
