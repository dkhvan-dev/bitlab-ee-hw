package bitlab.ee.homework.servlets;

import db.DBManager;
import db.Footballer;

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
        ArrayList<Footballer> footballers = DBManager.getAllFootballers();
        PrintWriter out = response.getWriter();

        response.setContentType("text/html");

        for (Footballer foot : footballers) {
            out.println("<h3>" + foot.getName() + " " + foot.getSurname() + " has " + foot.getSalary() + " salary, played in " + foot.getClub() + " and has " + foot.getTransferPrice() + " transfer price now</h3>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
