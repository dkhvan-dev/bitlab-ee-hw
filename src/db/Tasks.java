package db;

public class Tasks {
    private Long id;
    private String name;
    private String description;
    private String date;
    private String success;

    public Tasks() {
    }

    public Tasks(Long id, String name, String description, String date, String success) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.success = success;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
