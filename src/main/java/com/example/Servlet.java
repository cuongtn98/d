package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/test")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float pd = Float.parseFloat(request.getParameter("despro"));
        float lp = Float.parseFloat(request.getParameter("lisprice"));
        float dis= Float.parseFloat(request.getParameter("discount"));

        float pt = (float) (lp * dis * 0.1);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>phần trăm chiết khấu : " + pt + "</h1>");
        writer.println("</html>");

    }
}
