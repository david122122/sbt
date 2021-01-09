package com.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/api/getStudent"},loadOnStartup = 0)
public class ClientServlet extends HttpServlet {
    public ClientServlet(){
        System.out.println("init clientServlet");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        try {
            resp.getWriter().write("hello world!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        this.doGet(req,resp);
    }
}
