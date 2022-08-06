<%@ page import="db.Students" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <%@include file="bootstrap.jsp"%>
</head>
<body>
  <div class="container">
    <%
      Students student = (Students) request.getAttribute("student");
    %>

    <ul class="list-group">
      <li class="list-group-item mt-2"><%=student.getName()%></li>
      <li class="list-group-item mt-2"><%=student.getSurname()%></li>
      <li class="list-group-item mt-2"><%=student.getBirthdate()%></li>
      <li class="list-group-item mt-2"><%=student.getCity()%></li>
    </ul>
    <a href="/edit?id=<%=student.getId()%>" class="btn btn-primary mt-3">EDIT STUDENT</a>
  </div>
</body>
</html>
