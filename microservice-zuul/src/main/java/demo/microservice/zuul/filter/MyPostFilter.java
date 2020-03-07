package demo.microservice.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyPostFilter extends ZuulFilter {

    public String filterType() {
        return "post";
    }

    public int filterOrder() {
        return 0;
    }

    public boolean shouldFilter() {
        return true;
    }

    public Object run() throws ZuulException {
        log.info("enter MyPostFilter");
        RequestContext ctx = RequestContext.getCurrentContext();
        long startTime = (Long) ctx.get("startTime");
        log.info("execute time {}ms", System.currentTimeMillis() - startTime);
        return null;
    }
}
