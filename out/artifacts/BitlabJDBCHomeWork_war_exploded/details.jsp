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
    <h1>NAME: <%=student.getName()%></h1>
    <h1>SURNAME: <%=student.getSurname()%></h1>
    <h1>BIRTHDATE: <%=student.getBirthdate()%></h1>
    <h1>CITY: <%=student.getCity()%></h1>
  </div>
</body>
</html>
