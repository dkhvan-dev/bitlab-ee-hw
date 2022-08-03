<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Новое задание</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form action="/addTask" method="post">
                    <div class="mb-3">
                        <label for="recipient-name" class="col-form-label">Наименование :</label>
                        <input type="text" class="form-control" id="recipient-name" name="task_name">
                    </div>
                    <div class="mb-3">
                        <label for="message-text" class="col-form-label">Описание :</label>
                        <textarea class="form-control" id="message-text" name="task_description"></textarea>
                    </div>
                    <div class="mb-3">
                        <label for="task_date" class="col-form-label">Крайний срок :</label>
                        <input type="text" class="form-control" id="task_date" name="task_date">
                    </div>
                    <div class="mb-3">
                        <label class="col-form-label">Выполнено :</label>
                        <select name="task_success" class="form-control">
                            <option>Да</option>
                            <option>Нет</option>
                        </select>
                    </div>
                    <button type="button" class="btn btn-primary">Добавить</button>
                </form>
            </div>
        </div>
    </div>
</div>