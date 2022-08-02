package bitlab.ee.homework.servlets;

import bitlab.ee.homework.db.DBManager;
import bitlab.ee.homework.db.Items;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String name = request.getParameter("user_name");
       String surname = request.getParameter("user_surname");

       PrintWriter out = response.getWriter();

       out.println("Your name: " + name);
       out.println("Your surname: " + surname);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
