<%@ page import="java.util.ArrayList" %>
<%@ page import="db.Phones" %><%--
  Created by IntelliJ IDEA.
  User: Akashi
  Date: 02.08.2022
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <%@include file="bootstrap.jsp"%>
</head>
<body>
  <%@include file="header.jsp"%>
  <div class="container">
    <table class="table">
      <thead>
      <tr>
        <th scope="col">ID</th>
        <th scope="col">NAME</th>
        <th scope="col">PRICE</th>
        <th scope="col">AMOUNT</th>
        <th scope="col">DETAILS</th>
      </tr>
      </thead>

      <tbody>
        <%
          ArrayList<Phones> data = (ArrayList<Phones>) request.getAttribute("phones");
          if (data != null) {
            for (Phones el : data) {
        %>
      <tr>
        <td>
          <%=el.getId()%>
        </td>
        <td>
          <%=el.getName()%>
        </td>
        <td>
          <%=el.getPrice()%>
        </td>
        <td>
          <%=el.getAmount()%>
        </td>
        <td>
          <a href="#"class="btn btn-info btn-sm">DETAILS</a>
        </td>
      </tr>

        <%
            }
          }
        %>
      </tbody>
    </table>
  </div>
</body>
</html>
