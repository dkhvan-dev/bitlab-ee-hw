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
    <form action="/home" method="get">
      <label>
        FULL NAME :
      </label>
      <input type="text" name="user_name">

      <label>
        AGE :
      </label>
      <input type="number" name="user_age">

      <label>
        GENDER :
      </label>
      <input type="radio" id="male" name="gender" value="1">
      <label for="male">male</label>

      <input type="radio" id="female" name="gender" value="2">
      <label for="female">female</label>
      <button>SEND</button>
    </form>
  </body>
</html>
