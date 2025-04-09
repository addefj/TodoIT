package se.lexicon;

import se.lexicon.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;

public interface ITodoItemDAO {

    //fields
    ArrayList<TodoItem> todoItemList = new ArrayList<>();

    //methods
    TodoItem persist(TodoItem todoItem);
    TodoItem findById(int id);
    ArrayList<TodoItem> findAll();
    ArrayList<TodoItem> findAllByDoneStatus(boolean done);
    ArrayList<TodoItem> findByTitleContains(String title);
    ArrayList<TodoItem> findByPersonId(int personId); //todo:correct datatype?
    ArrayList<TodoItem> findByDeadlineBefore(LocalDate date);
    ArrayList<TodoItem> findByDeadlineAfter(LocalDate date);
    void remove(int id);





}
