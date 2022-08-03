package db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<News> news = new ArrayList<>();

    private static Long id = 5L;

    static {
        news.add(new News(1L, "The Crazy Way Falcon And The Winter Soldier's Anthony Mackie Learned About Captain", "Last Friday, Disnay+'s The Falcon and the Winter Soldier concluded its six-episode run...", "Adam Holmes", "cinema"));
        news.add(new News(2L, "Star Wars' Mark Hamill Addresses Horrifying Ewok Theory", "Most of the time, if you're enjoying the movie...", "Dirk Libbay", "cinema"));
        news.add(new News(3L, "Last Man Standing's Kaitlyn Dever Landed A Movie With ER Icon George Clooney", "If you're a fan of the soon-to-conclude Last Man Standing, then ...", "Adam Holmes", "sport"));
        news.add(new News(4L, "Mattew McConaughey Reveals The Question He Gets Asked The Most About Acting In Hollywood", "Oscar winner Mattew McConaughey...", "Adreon Patterson", "culture"));
    }

    public static ArrayList<News> getAllNews() {
        return news;
    }
}
