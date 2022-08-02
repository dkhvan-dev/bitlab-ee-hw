package bitlab.ee.homework.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String name = request.getParameter("user_name");
       int points = Integer.parseInt(request.getParameter("user_points"));
       char ch;


       PrintWriter out = response.getWriter();

       if (points >= 90) {
            ch = 'A';
       } else if (points >= 75 && points <= 89) {
           ch = 'B';
       } else if (points >= 60 && points <= 74) {
           ch = 'C';
       } else if (points >= 50 && points <= 59) {
           ch = 'D';
       } else ch = 'F';

       out.println(name + " got " + '"' + ch + '"' + " for exam!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
