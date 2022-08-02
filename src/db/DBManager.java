package db;

import java.io.PrintWriter;
import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Footballer> footballers = new ArrayList<>();

    private static Long id = 5L;

    static {
        footballers.add(new Footballer(1L, "Cristiano", "Ronaldo", 5000, "Real Madrid CF", 10000));
        footballers.add(new Footballer(2L, "Lionel", "Messi", 4000, "FC Barcelona", 8000));
        footballers.add(new Footballer(3L, "Neymar", "Da Silva Santos Junior", 3500, "FC Barcelona", 7000));
        footballers.add(new Footballer(4L, "Zlatan", "Ibragimovich", 3000, "FC Milan", 6000));
    }

    public static void addFootballer(Footballer footballer) {
        footballer.setId(id);
        footballers.add(footballer);
        id++;
    }

    public static ArrayList<Footballer> getAllFootballers() {
        return footballers;
    }
}
