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
        ArrayList<Items> items = DBManager.getItems();
        PrintWriter out = response.getWriter();
        out.println("<div style='display: flex; justify-content: space-between; width: 1000px; margin: 0;'><h1>NAME</h1><h1>SURNAME</h1><h1>DEPARTMENT</h1><h1>SALARY</h1></div>");

        for (Items it : items) {
            out.println("<div style='display: flex; justify-content: space-between; width: 1000px;'><h1>" + it.getName() + "</h1><h1>" + it.getSurname() + "</h1><h1>" + it.getDepartment() + "</h1><h1>" + it.getSalary() + "</h1></div>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
