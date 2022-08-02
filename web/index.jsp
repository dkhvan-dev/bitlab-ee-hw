<%--
  Created by IntelliJ IDEA.
  User: Akashi
  Date: 01.08.2022
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="/add" method="post" style="display: flex; flex-direction: column;">
      <label>
        NAME :
        <input type="text" name="user_name">
      </label>

      <label>
        SURNAME :
        <input type="text" name="user_surname">
      </label>

      <label>
        SALARY :
        <input type="number" name="user_salary">
      </label>

      <label>
        CLUB :
      <input type="text" name="user_club">
      </label>

      <label>
        TRANSFER PRICE :
      <input type="number" name="user_transfer_price">
      </label>

      <button>ADD FOOTBALLER</button>
    </form>
  </body>
</html>
