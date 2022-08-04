<%@ page import="db.Tasks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.Tasks" %>
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
          Tasks task = (Tasks)request.getAttribute("task");

          if (task != null) {
        %>
      <form action="/updateTask" method="post">
        <input type="hidden" name="id" value="<%=task.getId()%>">
        <div class="mb-3">
          <label for="task-name" class="col-form-label">Наименование :</label>
          <input type="text" class="form-control" id="task-name" name="task_name" value="<%=task.getName()%>">
        </div>
        <div class="mb-3">
          <label for="task-text" class="col-form-label">Описание :</label>
          <textarea class="form-control" id="task-text" name="task_description"><%=task.getDescription()%></textarea>
        </div>
        <div class="mb-3">
          <label for="task-date" class="col-form-label">Крайний срок :</label>
          <input type="text" class="form-control" id="task-date" name="task_date" value="<%=task.getDate()%>">
        </div>
        <div class="mb-3">
          <label class="col-form-label">Выполнено :</label>
          <select name="task_success" class="form-control">
            <option><%=task.getSuccess()%></option>
            <option>Нет</option>
          </select>
        </div>
        <button type="submit" class="btn btn-primary">Сохранить</button>
      </form>
      <form action="/deleteTask" method="post">
        <input type="hidden" name="id" value="<%=task.getId()%>">
        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
          Удалить
        </button>
        <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
              </div>
              <div class="modal-body">
                Вы действительно хотите удалить запись?
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Закрыть</button>
                <button type="submit" class="btn btn-primary">Да</button>
              </div>
            </div>
          </div>
        </div>
      </form>
      <%
          }
        %>
    </div>
    <%@include file="footer.jsp"%>
  </body>
</html>