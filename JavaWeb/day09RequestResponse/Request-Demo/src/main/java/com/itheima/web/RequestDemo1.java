package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author qilin
 */
@WebServlet("/req1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String getMethod() 获取请求方式
        String method = req.getMethod();
        System.out.println("请求方式：" + method);
        //String getContextPath() 获取虚拟目录（项目访问路径）：/request-demo
        String contextPath = req.getContextPath();
        System.out.println("项目访问路径：" + contextPath);
        //StringBuffer getRequestURL() 获取URL（统一资源定位符）：http://localhost:8080/request-demo/req1
        StringBuffer requestUrl = req.getRequestURL();
        System.out.println("Request URL: " + requestUrl);
        //String getRequestURI() 获取URI（统一资源标识符）：/request-demo/req1
        String requestURI = req.getRequestURI();
        System.out.println("Request URI: " + requestURI);
        //String getQueryString() 获取请求参数（GET方式）：username=zhangsan&password=123
        String queryString = req.getQueryString();
        System.out.println("Query string: " + queryString);

        String header = req.getHeader("user-agent");
        System.out.println(header);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取 post 请求体：请求参数

        // 获取字符输入流
        BufferedReader br = req.getReader();

        String line = br.readLine();
        System.out.println(line);
    }
}
