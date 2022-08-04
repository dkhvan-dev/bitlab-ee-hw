package db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Tasks> tasks = new ArrayList<>();

    private static Long id = 6L;

    static {
        tasks.add(new Tasks(1L, "Создать Веб приложение на JAVA EE", "Нужно создать крупный проект и выложить его на Gitlab","23.10.2021", "Да"));
        tasks.add(new Tasks(2L, "Убраться дома и закупить продукты", "Тряпка и ведро лежат в ванной комнате","25.10.2021", "Да"));
        tasks.add(new Tasks(3L, "Выполнить все домашние задания", "Покормить собаку, помыть посуду","28.10.2021", "Нет"));
        tasks.add(new Tasks(4L, "Записаться на качку", "Качку нефти :)","12.12.2021", "Нет"));
        tasks.add(new Tasks(5L, "Учить Итальянский", "Итальянский язык, чтобы заказать итальянскую пиццу","01.05.2021", "Нет"));
    }

    public static ArrayList<Tasks> getAllTasks() {
        return tasks;
    }

    public static void addTask(Tasks task) {
        task.setId(id);
        tasks.add(task);
        id++;
    }

    public static Tasks getTask(Long id) {
        for (Tasks task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public static void updateTask(Long id, String name, String description, String date, String success) {
        for (Tasks task : tasks) {
            if (task.getId() == id) {
                task.setName(name);
                task.setDescription(description);
                task.setDate(date);
                task.setSuccess(success);
            }
        }
    }

    public static void deleteTask(Long id) {
        for(int i = 0; i < tasks.size(); i++){
            if(tasks.get(i).getId().equals(id)){
                tasks.remove(i);
                break;
            }
        }
    }
}
