package com.qf.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//dfikjasdikfjoisjdfiknmsokdjf
public class HelloServlet extends HttpServlet{
    @Override
    //jdasfkjlkdjfkijdfkl
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("tomcat环境配置成功！！");
    }
}
