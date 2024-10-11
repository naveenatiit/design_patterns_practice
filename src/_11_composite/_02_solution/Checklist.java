package _11_composite._02_solution;

import java.util.ArrayList;
import java.util.List;

public class Checklist implements Completable {

    List<TodoItem> todoItems = new ArrayList<>();

    public void addTodoItem(TodoItem todoItem) {
        todoItems.add(todoItem);
    }

    @Override
    public void isCompleted() {
        todoItems.forEach(TodoItem::isCompleted);
    }

}
