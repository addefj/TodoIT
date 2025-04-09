package se.lexicon;

import se.lexicon.model.TodoItemTask;

import java.util.ArrayList;

public interface ITodoItemTaskDAO {

    //fields
    ArrayList<TodoItemTask> todoItemTaskList = new ArrayList<>();

    //methods
    TodoItemTask persist(TodoItemTask todoItemTask);
    TodoItemTask findById(int id);
    ArrayList<TodoItemTask> findAll();
    ArrayList<TodoItemTask> findByAssignedStatus(boolean assigned);
    ArrayList<TodoItemTask> findByPersonId(int personId); //todo: correct datatype?
    void remove(int id);


}
