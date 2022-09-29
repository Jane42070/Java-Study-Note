package com.itheima.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * urlPattern: 一个 Servlet 可以配置多个访问路径
 *
 * @author qilin
 */
@WebServlet(urlPatterns = {"/demo6", "/demo7"})
public class ServletDemo6 extends MyHttpServlet {
    @Override
    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("demo6 get...");
    }

    @Override
    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("post...");
    }
}
