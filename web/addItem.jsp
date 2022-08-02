<%--
  Created by IntelliJ IDEA.
  User: Akashi
  Date: 02.08.2022
  Time: 22:59
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
    <form action="/addItem" method="post">
      <div class="form-group">
        <label>NAME :</label><br>
        <input type="text" name="name" class="form-control" placeholder="Insert name">
      </div>

      <div class="form-group">
        <label>PRICE :</label><br>
        <input type="number" name="price" class="form-control" placeholder="Insert price">
      </div>

      <div class="form-group">
        <label>AMOUNT :</label><br>
        <input type="number" name="amount" class="form-control" placeholder="Insert amount">
      </div>
      <button class="btn btn-primary">ADD ITEM</button>
    </form>
  </div>
</body>
</html>
