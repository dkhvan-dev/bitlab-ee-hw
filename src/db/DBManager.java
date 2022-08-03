package db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Tasks> tasks = new ArrayList<>();

    private static Long id = 6L;

    static {
        tasks.add(new Tasks(1L, "������� ��� ���������� �� JAVA EE", "����� ������� ������� ������ � �������� ��� �� Gitlab","23.10.2021", "��"));
        tasks.add(new Tasks(2L, "�������� ���� � �������� ��������", "������ � ����� ����� � ������ �������","25.10.2021", "��"));
        tasks.add(new Tasks(3L, "��������� ��� �������� �������", "��������� ������, ������ ������","28.10.2021", "���"));
        tasks.add(new Tasks(4L, "���������� �� �����", "����� ����� :)","12.12.2021", "���"));
        tasks.add(new Tasks(5L, "����� �����������", "����������� ����, ����� �������� ����������� �����","01.05.2021", "���"));
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
}
