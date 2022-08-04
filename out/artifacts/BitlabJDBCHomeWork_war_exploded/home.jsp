<%@ page import="java.util.ArrayList" %>
<%@ page import="db.Students" %>
<%@ page import="db.DBUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <%@include file="bootstrap.jsp"%>
  </head>
  <body>
    <div class="container">
      <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo">Добавить студента</button>

      <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title" id="exampleModalLabel">Новый студент</h5>
              <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
              <form action="/addStudent" method="post">
                <div class="mb-3">
                  <label for="student_name" class="col-form-label">NAME:</label>
                  <input type="text" class="form-control" id="student_name" name="student_name">
                </div>
                <div class="mb-3">
                  <label for="student_surname" class="col-form-label">SURNAME:</label>
                  <input type="text" class="form-control" id="student_surname" name="student_surname">
                </div>
                <div class="mb-3">
                  <label for="student_birthdate" class="col-form-label">BIRTHDATE:</label>
                  <input type="text" class="form-control" id="student_birthdate" name="student_birthdate">
                </div>
                <div class="mb-3">
                  <label for="student_city" class="col-form-label">CITY:</label>
                  <input type="text" class="form-control" id="student_city" name="student_city">
                </div>
                <button type="submit" class="btn btn-primary">Добавить</button>
              </form>
            </div>
          </div>
        </div>
      </div>
      <table class="table" style="margin-top: 20px;">
        <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">NAME</th>
          <th scope="col">SURNAME</th>
          <th scope="col">BIRTHDATE</th>
          <th scope="col">CITY</th>
        </tr>
        </thead>
        <tbody>
        <%
          ArrayList<Students> students = (ArrayList<Students>) request.getAttribute("students");
          for (Students st : students) {
        %>

        <tr>
          <th><%=st.getId()%></th>
          <td><%=st.getName()%></td>
          <td><%=st.getSurname()%></td>
          <td><%=st.getBirthdate()%></td>
          <td><%=st.getCity()%></td>
          <td>
            <a href="/details?id=<%=st.getId()%>" class="btn btn-dark">DETAILS</a>
          </td>
        </tr>

        <%
          }
        %>
        </tbody>
      </table>
    </div>
  </body>
</html>
