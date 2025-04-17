package se.lexicon.dao.impl;

import se.lexicon.dao.ITodoItemDAO;
import se.lexicon.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;

public class TodoItemDAOCollection implements ITodoItemDAO {

    //fields
    ArrayList<TodoItem> todoItems = new ArrayList<>();

    //constructor
    public TodoItemDAOCollection(ArrayList<TodoItem> todoItems) {
        this.todoItems = todoItems;
    }


    //methods
    @Override
    public TodoItem persist(TodoItem todoItem) {
        todoItems.add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findById(int id) {
        for(TodoItem item: todoItems){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    @Override
    public ArrayList<TodoItem> findAll() {
        return todoItems;
    }

    @Override
    public ArrayList<TodoItem> findAllByDoneStatus(boolean done) {
        ArrayList<TodoItem> todoItemsTemp = new ArrayList<>();
        for(TodoItem item: todoItems){
            if(item.isDone() == done){
                todoItemsTemp.add(item);
            }
        }
        return todoItemsTemp;
    }

    @Override
    public ArrayList<TodoItem> findByTitleContains(String title) {
        ArrayList<TodoItem> todoItemsTemp = new ArrayList<>();
        for(TodoItem item: todoItems){
            if(item.getTitle().toLowerCase().contains(title.toLowerCase())){
                todoItemsTemp.add(item);
            }
        }
        return todoItemsTemp;
    }

    @Override
    public ArrayList<TodoItem> findByPersonId(int personId) {
        ArrayList<TodoItem> todoItemsTemp = new ArrayList<>();
        for(TodoItem item: todoItems){
            if(item.getCreator().getId() == personId){
                todoItemsTemp.add(item);
            }
        }
        return todoItemsTemp;
    }

    @Override
    public ArrayList<TodoItem> findByDeadlineBefore(LocalDate date) {
        ArrayList<TodoItem> todoItemsTemp = new ArrayList<>();
        for(TodoItem item: todoItems){
            if(date.isBefore(item.getDeadLine())){
                todoItemsTemp.add(item);
            }
        }
        return todoItemsTemp;
    }

    @Override
    public ArrayList<TodoItem> findByDeadlineAfter(LocalDate date) {
        ArrayList<TodoItem> todoItemsTemp = new ArrayList<>();
        for(TodoItem item: todoItems){
            if(date.isAfter(item.getDeadLine())){
                todoItemsTemp.add(item);
            }
        }
        return todoItemsTemp;
    }

    @Override
    public void remove(int id) {
        for (TodoItem item : todoItems) {
            if (item.getId() == id) {
                todoItems.remove(item);
                break;
            }
        }
    }
}
