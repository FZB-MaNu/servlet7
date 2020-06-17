package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/success")
public class SuccessServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession();
//        if (session != null) {
//            Object obj = session.getAttribute("session_account");
//            if (obj != null) {
//                response.sendRedirect("/success.jsp");
//                return;
//            }
//        }
//
//        //非法登录，强制跳转到登录页面
//        response.sendRedirect("/index.jsp");

        response.sendRedirect("/success.jsp");
    }
}
