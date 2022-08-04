package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBUtil {

    private static Connection connection;

    static {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_home_work_db?useUnicode=true&serverTimezone=UTC", "root", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean addStudent(Students student) {
        int rows = 0;

        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO students (id, name, surname, birthdate, city) " +
                    "VALUES (NULL, ?, ?, ?, ?)" +
                    "");
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setString(3, student.getBirthdate());
            statement.setString(4, student.getCity());

            rows = statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows > 0;
    }

    public static ArrayList<Students> getStudents() {
        ArrayList<Students> students = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT id, name, surname, birthdate, city " +
                    "FROM students");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                students.add(new Students(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getString("surname"),
                    resultSet.getString("birthdate"),
                    resultSet.getString("city")
                ));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
