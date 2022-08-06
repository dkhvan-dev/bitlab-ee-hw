package BitlabJDBCServlets;

import db.DBUtil;
import db.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/updateStudent")
public class UpdateStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF8");
        Long id = Long.parseLong(request.getParameter("student_id"));
        Students student = DBUtil.getStudent(id);
        String redirect = "/edit?id=" + id + "&error";

        if (student != null) {
            String name = request.getParameter("student_name");
            String surname = request.getParameter("student_surname");
            String birthdate = request.getParameter("student_birthdate");
            String city = request.getParameter("student_city");

            student.setName(name);
            student.setSurname(surname);
            student.setBirthdate(birthdate);
            student.setCity(city);

            DBUtil.updateStudent(student);
            redirect = "/edit?id=" + id + "&success";
        }

        response.sendRedirect(redirect);
    }
}
