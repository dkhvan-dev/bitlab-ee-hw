package bitlab.ee.homework.servlets;

import db.DBManager;
import db.Tasks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/details")
public class DetailsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        Tasks task = DBManager.getTask(id);
        if (task != null) {
            req.setAttribute("task", task);
            req.getRequestDispatcher("/details.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/404.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");
        Long id = Long.parseLong(req.getParameter("id"));
        String name = req.getParameter("task_name");
        String description = req.getParameter("task_description");
        String date = req.getParameter("task_date");
        String success = req.getParameter("task_success");

        DBManager.updateTask(id, name, description, date, success);
        resp.sendRedirect("/details?id=" + id);

    }
}
