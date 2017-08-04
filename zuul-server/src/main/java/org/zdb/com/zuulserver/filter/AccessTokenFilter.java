package org.zdb.com.zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 网关的过滤器（安全访问的过滤器）
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
public class AccessTokenFilter extends ZuulFilter{
    /**
     * 过滤器的生命周期
     pre：进行路由前调用；

     routing：进行路由的时候调用；

     error：发生错误时调用；

     post：routing&error之后调用；
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器的排序，数越小，优先级越高
     * @return
     */
    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        //过滤器的开发，可以通过配置文件的方式决定此过滤器的开关，开发环境不开，生产环境开
        RequestContext requestContext=RequestContext.getCurrentContext();
        boolean flag=false;
        if(requestContext.get("checkCode")!=null && 200==(int)requestContext.get("checkCode")){
            flag=true;
        }
        return flag;
    }

    @Override
    public Object run() {
        RequestContext requestContext=RequestContext.getCurrentContext();
        requestContext.getResponse().setContentType("application/json;charset=utf-8");
        HttpServletRequest request=requestContext.getRequest();
        System.out.println("zuul filter:"+request.getRequestURI());
        String accessToken=request.getParameter("accessToken");
        if(StringUtils.isEmpty(accessToken)){
            System.out.println("accessToken is null");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            requestContext.setResponseBody("AccessToken 不能为空");
            return null;
        }else{
            System.out.println("=====AccessToken success======");
        }
        return null;
    }
}
