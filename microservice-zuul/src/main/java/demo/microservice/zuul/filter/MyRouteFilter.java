package demo.microservice.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyRouteFilter extends ZuulFilter {

    public String filterType() {
        return "route";
    }

    public int filterOrder() {
        return 0;
    }

    public boolean shouldFilter() {
        return true;
    }

    public Object run() throws ZuulException {
        log.info("enter MyRouteFilter");
        return null;
    }
}
