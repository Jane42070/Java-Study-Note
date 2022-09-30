package com.itheima.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author qilin
 */
public class MyHttpServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 根据请求方式的不同，进行分别的处理

        // 1. 获取请求方法
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String method = request.getMethod();
        // 2. 判断
        if (method.equals("GET")) {
            // get 方式的处理逻辑
            doGet(servletRequest, servletResponse);
        } else if (method.equals("POST")) {
            // post 方式的处理逻辑
            doPost(servletRequest, servletResponse);
        }
    }

    // protected 子类可以看到这个方法
    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {

    }

    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {

    }


    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
