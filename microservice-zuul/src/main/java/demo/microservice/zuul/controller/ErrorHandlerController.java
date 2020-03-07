package demo.microservice.zuul.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ErrorHandlerController implements ErrorController {

    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public ResponseEntity error(HttpServletRequest request) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("success", false);
        resultMap.put("msg", "服务异常");
        return new ResponseEntity<>(resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
