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
       String surname = request.getParameter("user_surname");
       String food = request.getParameter("user_food");

       PrintWriter out = response.getWriter();

       out.println("" + name + " " + surname + " ordered " + food);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
