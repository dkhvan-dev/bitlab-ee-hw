<%@ page import="db.Students" %>
<%@ page import="db.DBUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <%@include file="bootstrap.jsp"%>
</head>
<body>
  <div class="container">
    <div class="row mt-3">
      <div class="col-6 mx-auto">
        <%
          Students student = (Students) request.getAttribute("student");
        %>
        <form action="/updateStudent" method="post">
          <input type="hidden" value="<%=student.getId()%>" name="student_id">
          <div class="mb-3">
            <label for="student_name" class="col-form-label">NAME:</label>
            <input type="text" class="form-control" id="student_name" name="student_name" value="<%=student.getName()%>">
          </div>
          <div class="mb-3">
            <label for="student_surname" class="col-form-label">SURNAME:</label>
            <input type="text" class="form-control" id="student_surname" name="student_surname" value="<%=student.getSurname()%>">
          </div>
          <div class="mb-3">
            <label for="student_birthdate" class="col-form-label">BIRTHDATE:</label>
            <input type="text" class="form-control" id="student_birthdate" name="student_birthdate" value="<%=student.getBirthdate()%>">
          </div>
          <div class="mb-3">
            <label for="student_city" class="col-form-label">CITY:</label>
            <input type="text" class="form-control" id="student_city" name="student_city" value="<%=student.getCity()%>">
          </div>
          <button type="submit" class="btn btn-primary">SAVE STUDENT</button>

          <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#deleteStudent">
            DELETE STUDENT
          </button>
        </form>
        <div class="modal fade" id="deleteStudent" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <form action="/deleteStudent" method="post">
                <input type="hidden" value="<%=student.getId()%>" name="student_id">
                <div class="modal-header">
                  <h5 class="modal-title" id="staticBackdropLabel">Confirm Delete</h5>
                  <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                  Are you sure?
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">NO</button>
                  <button class="btn btn-danger">YES</button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
