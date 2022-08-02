package db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Phones> data = new ArrayList<>();

    private static Long id = 6L;
    static {
        data.add(new Phones(1L, "Iphone 13 Pro Max", 450000, 10));
        data.add(new Phones(2L, "XIAOMI REDMI NOTE 8", 82000, 20));
        data.add(new Phones(3L, "Oppo 3 Model X", 350000, 15));
        data.add(new Phones(4L, "Macbook Pro M1 13", 750000, 15));
        data.add(new Phones(5L, "ASUS TUF Gaming", 340000, 7));
    }

    public static void addPhone(Phones newData) {
        newData.setId(id);
        data.add(newData);
        id++;
    }

    public static ArrayList<Phones> getData() {
        return data;
    }

    public static Phones getPhone(Long id) {
        for (Phones el : data) {
            if (el.getId() == id) {
                return el;
            }
        }
        return null;
    }
}
