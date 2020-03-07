package demo.microservice.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyErrorFilter extends ZuulFilter {

    public String filterType() {
        return "error";
    }

    public int filterOrder() {
        return 0;
    }

    public boolean shouldFilter() {
        return true;
    }

    public Object run() throws ZuulException {
        log.info("enter MyErrorFilter");
        RequestContext ctx = RequestContext.getCurrentContext();
        Throwable throwable = ctx.getThrowable();
        log.error("error is {}", throwable.getCause().getMessage());
        return null;
    }
}
