package org.zdb.com.zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户认证的过滤器（优先级高于AccessTokenFilter）
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
public class AuthFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext=RequestContext.getCurrentContext();
        requestContext.getResponse().setContentType("application/json;charset=utf-8");
        HttpServletRequest request=requestContext.getRequest();
        System.out.println("zuul filter:"+request.getRequestURI());
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        if("admin".equals(userName) && "123456".equals(password)){
            System.out.println("auth ok ");
            requestContext.setSendZuulResponse(true);
            requestContext.setResponseStatusCode(200);
            requestContext.set("checkCode",200);
        }else{
            System.out.println("auth fail ");
            requestContext.setSendZuulResponse(true);
            requestContext.setResponseStatusCode(401);
            requestContext.set("checkCode",100);
            requestContext.setResponseBody("auth fail");
        }
        return null;
    }
}
