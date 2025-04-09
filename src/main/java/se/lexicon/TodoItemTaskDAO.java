package se.lexicon;

import se.lexicon.model.TodoItemTask;

import java.util.ArrayList;

public class TodoItemTaskDAO implements ITodoItemTaskDAO{

    //fields
    ArrayList<TodoItemTask> todoItemTaskList = new ArrayList<>();

    //todo: choose right collection, add constructor, implement methods

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        return null;
    }

    @Override
    public TodoItemTask findById(int id) {
        return null;
    }

    @Override
    public ArrayList<TodoItemTask> findAll() {
        return null;
    }

    @Override
    public ArrayList<TodoItemTask> findByAssignedStatus(boolean assigned) {
        return null;
    }

    @Override
    public ArrayList<TodoItemTask> findByPersonId(int personId) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
