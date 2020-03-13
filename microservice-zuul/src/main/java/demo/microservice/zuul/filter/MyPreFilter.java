package demo.microservice.zuul.filter;

import com.alibaba.fastjson.JSON;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyPreFilter extends ZuulFilter {

    public String filterType() {
        return "pre";
    }

    // 数值越小越先执行
    public int filterOrder() {
        return 0;
    }

    public boolean shouldFilter() {
        return true;
    }

    public Object run() throws ZuulException {
        log.info("enter MyPreFilter");
        RequestContext ctx = RequestContext.getCurrentContext();
        log.info("uri:{},params:{}", ctx.getRequest().getRequestURI(), JSON.toJSONString(ctx.getRequest().getParameterMap()));
        // 过滤器中传递数据
        ctx.set("startTime", System.currentTimeMillis());

        // 过滤该请求，不对其进行路由
        // ctx.setSendZuulResponse(false);
        // 作为下一个filter是否执行的依据 shouldFilter: return ctx.getBoolean("isSuccess");
        // ctx.set("isSuccess", false);

        // ctx.setResponseStatusCode(403);
        // ctx.getResponse().setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        // ctx.setResponseBody("{\"success\":false,\"msg\":\"没有权限\"}");
        return null;
    }
}
