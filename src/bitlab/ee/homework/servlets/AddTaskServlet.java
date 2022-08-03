package bitlab.ee.homework.servlets;

import db.DBManager;
import db.Tasks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addTask")
public class AddTaskServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/allTasks.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("task_name");
        String description = req.getParameter("task_description");
        String date = req.getParameter("task_date");
        String success = req.getParameter("task_success");

        Tasks el = new Tasks(null, name, description, date, success);
        DBManager.addTask(el);
        resp.sendRedirect("/home");
    }
}
