<%@ page import="db.Phones" %><%--
  Created by IntelliJ IDEA.
  User: Akashi
  Date: 02.08.2022
  Time: 23:15
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
    <%
      Phones data = (Phones) request.getAttribute("phone");
      if (data != null) {

    %>
    <h3>NAME :</h3>
    <h5 style="font-weight: bold;"><%=data.getName()%></h5>
    <h3>PRICE :</h3>
    <h5 style="font-weight: bold;"><%=data.getPrice()%></h5>
    <h3>AMOUNT :</h3>
    <h5 style="font-weight: bold;"><%=data.getAmount()%></h5>
    <%
      }
    %>
  </div>
</body>
</html>
