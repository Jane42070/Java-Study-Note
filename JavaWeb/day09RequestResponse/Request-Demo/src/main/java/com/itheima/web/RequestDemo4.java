package com.itheima.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 对应中文乱码问题的解决方案
 *
 * @author qilin
 */
@WebServlet(name = "RequestDemo4", value = "/RequestDemo4")
public class RequestDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 2. 解决乱码：POST getReader
        // 设置字符输入流的编码
        request.setCharacterEncoding("UTF-8");

        // 1. 获取 username
        String username = request.getParameter("username");
        System.out.println("解决乱码前：" + username);

        // GET 解决乱码问题
        // 1. 获取字节数组
        // byte[] bytes = username.getBytes(StandardCharsets.ISO_8859_1);
        // 2. 字节数组解码，转成 UTF-8
        // String s = new String(bytes, StandardCharsets.UTF_8);
        // 写成一行代码
        String s = new String(username.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        System.out.println("解决乱码后：" + s);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
