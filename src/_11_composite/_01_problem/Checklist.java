package _11_composite._01_problem;

import java.util.ArrayList;
import java.util.List;

public class Checklist {

    List<TodoItem> todoItems = new ArrayList<>();

    public void addTodoItem(TodoItem todoItem) {
        todoItems.add(todoItem);
    }

}
