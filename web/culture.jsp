<%@ page import="java.util.ArrayList" %>
<%@ page import="db.News" %>
<%@ page import="db.DBManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <%@include file="bootstrap.jsp"%>
</head>
<body style="min-height: 100%; display: grid; grid-template-rows: auto 1fr auto;">
  <%@include file="header.jsp"%>
  <div class="container">
    <%
      ArrayList<News> allNews = DBManager.getAllNews();
      for (News el : allNews) {
        if (el.getCategory().equals("culture")) {
    %>
      <div class="col-12" style="margin-top: 20px; padding: 20px; background-color: #e1e1e1;">
        <h1><%=el.getTitle()%></h1>
        <p style="font-size: 24px"><%=el.getContent()%></p>
        <p>Author: <strong><%=el.getAuthor()%></strong></p>
      </div>
    <%
        }
      }
    %>
  </div>
  <%@include file="footer.jsp"%>
</body>
</html>
