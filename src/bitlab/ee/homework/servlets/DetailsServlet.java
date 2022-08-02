package bitlab.ee.homework.servlets;

import db.DBManager;
import db.Phones;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/detailsServlet")
public class DetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        Phones data = DBManager.getPhone(id);

        if (data != null) {
            req.setAttribute("phone", data);
            req.getRequestDispatcher("/details.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/404.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
