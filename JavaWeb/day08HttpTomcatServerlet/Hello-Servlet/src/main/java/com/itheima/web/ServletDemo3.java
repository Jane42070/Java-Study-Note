package com.itheima.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Servlet 方法介绍
 *
 * @param loadOnStartup 为正数，服务器运行时创建Servlet对象；负数，访问时创建Servlet对象
 * @param urlPatterns   访问时的 url 后缀
 * @param config
 * @author qilin
 */

@WebServlet(urlPatterns = "/demo2", loadOnStartup = 1)
public class ServletDemo3 implements Servlet {
    private ServletConfig config;

    /**
     * 初始化
     * 默认情况下，Servlet 被第一次访问时调用
     * 调用次数：1次
     */
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("init");
    }

    /**
     * 提供服务
     * 1. 调用时机：每一次Servlet被访问时，调用
     * 2. 调用次数：多次
     *
     * @param servletRequest  servlet 请求的参数
     * @param servletResponse servlet 返回的参数
     * @throws ServletException
     * @throws IOException
     */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet hello world!");
    }

    /**
     * 销毁方法
     * 调用时机：Servlet 被销毁的时候，调用
     * 服务器关闭，内存释放的时候，Servlet 对象会被销毁，调用 destroy 方法销毁资源
     * 调用一次
     */
    public void destroy() {
        System.out.println("destroy");
    }

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return config;
    }
}
