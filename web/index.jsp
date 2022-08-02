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
        NAME :
      </label>
      <input type="text" name="user_name">

      <label>
        SURNAME :
      </label>
      <input type="text" name="user_surname">

      <label>
        FOOD :
      </label>
      <select name="user_food">
        <option>Manty - 900 KZT</option>
        <option>Lagman - 1500 KZT</option>
        <option>Doner - 1200 KZT</option>
      </select>
      <button>ORDER</button>
    </form>
  </body>
</html>
