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

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Tasks> tasks = DBManager.getAllTasks();
        req.setAttribute("tasks", tasks);
        req.getRequestDispatcher("/home.jsp").forward(req, resp);
    }
}
