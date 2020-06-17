package com;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/*")
public class SysFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;

        Object url=request.getRequestURL();
        String uri=url.toString();
        if (uri.endsWith("index.jsp") || uri.endsWith("/") || uri.endsWith("/login")){

        }else{
            HttpSession session=request.getSession();
            if (session !=null){
                Object obj= session.getAttribute("session_account");
                if (obj==null){
                    //没有登录信息,跳转到登录页面
                    request.getRequestDispatcher("/index.jsp").forward(request,response);
                }
            }
        }
    }
}
