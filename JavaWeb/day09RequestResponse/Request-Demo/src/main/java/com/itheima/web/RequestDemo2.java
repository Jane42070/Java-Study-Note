package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author qilin
 */
@WebServlet("/req2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // GET 请求逻辑
        System.out.println("get...");
        // 获取所有参数集合
        Map<String, String[]> map = req.getParameterMap();
        for (String key : map.keySet()) {
            System.out.print(key + ":");
            String[] values = map.get(key);
            // 获取值
            for (String value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // POST 请求逻辑
        // 执行 GET 方法代码
        // request 可以使用通用方法
        this.doGet(req, resp);
    }
}
