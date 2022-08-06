package BitlabJDBCServlets;

import db.DBUtil;
import db.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/deleteStudent")
public class DeleteStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF8");
        Long id = Long.parseLong(request.getParameter("student_id"));
        String redirect = "/";

        Students student = DBUtil.getStudent(id);

        if (student != null) {
            DBUtil.deleteStudent(id);
            redirect = "/";
        }

        response.sendRedirect(redirect);
    }
}
