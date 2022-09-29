package com.itheima.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * urlPattern: 一个 Servlet 可以配置多个访问路径
 * urlPatterns = "/demo8/*" 会使所有的下的 都访问这个 servlet
 * 比如 /demo8/a , /demo8/a/b
 * 思考:
 * 1. 访问路径 http://localhost:8080/web-demo/user 是否能访问到demo9的doGet方法?
 * 2. 访问路径 http://localhost:8080/web-demo/user/a/b 是否能访问到demo9的doGet方法?
 * 3. 访问路径 http://localhost:8080/web-demo/user/select 是否能访问到demo9还是demo8的doGet方法?
 * 答案是: 能、能、demo8，进而我们可以得到的结论是/user/*中的/*代表的是零或多个层级访问目录同时精确匹配优先级要高于目录匹配。
 * @author qilin
 */
@WebServlet(urlPatterns = "/demo8/*")
public class ServletDemo7 extends MyHttpServlet {
    @Override
    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("demo6 get...");
    }

    @Override
    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("post...");
    }
}
