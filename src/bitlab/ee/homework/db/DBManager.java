package bitlab.ee.homework.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Items> items = new ArrayList<>();

    static {
        items.add(new Items(1L, "Ilyas", "Zhuanyshev", "IT", 550000));
        items.add(new Items(2L, "Aybek", "Bagit", "Management", 650000));
        items.add(new Items(3L, "Alibek", "Serikov", "HR", 350000));
        items.add(new Items(4L, "Serzhan", "Berikov", "IT", 450000));
        items.add(new Items(5L, "Madina", "Assetova", "PR", 350000));
        items.add(new Items(6L, "Anel", "Mukhamejanova", "Management", 400000));
    }

    public static ArrayList<Items> getItems() {
        return items;
    }
}