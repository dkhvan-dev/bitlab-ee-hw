package bitlab.ee.homework.servlets;

import db.DBManager;
import db.Footballer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "AddServlet", value = "/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");
        int salary = Integer.parseInt(request.getParameter("user_salary"));
        String club = request.getParameter("user_club");
        int transferPrice = Integer.parseInt(request.getParameter("user_transfer_price"));

        Footballer footballer = new Footballer();
        footballer.setName(name);
        footballer.setSurname(surname);
        footballer.setSalary(salary);
        footballer.setClub(club);
        footballer.setTransferPrice(transferPrice);
        DBManager.addFootballer(footballer);

        response.sendRedirect("/home");
    }
}
