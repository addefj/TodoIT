package se.lexicon.dao;

import se.lexicon.model.TodoItemTask;

import java.util.ArrayList;

public interface ITodoItemTaskDAO {

    //methods
    TodoItemTask persist(TodoItemTask todoItemTask);
    TodoItemTask findById(int id);
    ArrayList<TodoItemTask> findAll();
    ArrayList<TodoItemTask> findByAssignedStatus(boolean assigned);
    ArrayList<TodoItemTask> findByPersonId(int personId);
    void remove(int id);


}
