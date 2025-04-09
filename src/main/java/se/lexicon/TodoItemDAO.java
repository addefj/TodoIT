package se.lexicon;

import se.lexicon.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;

public class TodoItemDAO implements ITodoItemDAO{

    //fields
    ArrayList<TodoItem> todoItemList = new ArrayList<>();

    //todo: choose right collection, add constructor, implement methods

    @Override
    public TodoItem persist(TodoItem todoItem) {
        return null;
    }

    @Override
    public TodoItem findById(int id) {
        return null;
    }

    @Override
    public ArrayList<TodoItem> findAll() {
        return null;
    }

    @Override
    public ArrayList<TodoItem> findAllByDoneStatus(boolean done) {
        return null;
    }

    @Override
    public ArrayList<TodoItem> findByTitleContains(String title) {
        return null;
    }

    @Override
    public ArrayList<TodoItem> findByPersonId(int personId) {
        return null;
    }

    @Override
    public ArrayList<TodoItem> findByDeadlineBefore(LocalDate date) {
        return null;
    }

    @Override
    public ArrayList<TodoItem> findByDeadlineAfter(LocalDate date) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
