package _11_composite._01_problem;

public class TodoItem {

    private final String description;
    private boolean completed = false;

    public TodoItem(String description) {
        this.description = description;
    }

    public void complete() {
        completed = true;
    }

}
