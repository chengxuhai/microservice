package demo.microservice.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyPreFilter extends ZuulFilter {

    public String filterType() {
        return "pre";
    }

    public int filterOrder() {
        return 0;
    }

    public boolean shouldFilter() {
        return true;
    }

    public Object run() throws ZuulException {
        log.info("enter MyPreFilter");
        RequestContext ctx = RequestContext.getCurrentContext();
        // 过滤器中传递数据
        ctx.set("startTime", System.currentTimeMillis());
        return null;
    }
}
