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
       int age = Integer.parseInt(request.getParameter("user_age"));
       String gender = request.getParameter("gender");


       PrintWriter out = response.getWriter();

       if (age >= 18) {
           if (gender.equals("1")) {
               out.println("Hello Dear Mister " + name + "!");
           } else {
               out.println("Hello Dear Miss " + name + "!");
           }
       } else {
           if (gender.equals("1")) {
               out.println("Hello Dude Mister " + name + "!");
           } else {
               out.println("Hello Dude Miss " + name + "!");
           }
       }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
