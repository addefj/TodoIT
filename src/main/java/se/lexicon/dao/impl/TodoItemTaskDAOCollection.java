package se.lexicon.dao.impl;

import se.lexicon.dao.ITodoItemTaskDAO;
import se.lexicon.model.TodoItemTask;

import java.util.ArrayList;

public class TodoItemTaskDAOCollection implements ITodoItemTaskDAO {

    //fields
    ArrayList<TodoItemTask> todoItemTasks = new ArrayList<>();

    //constructor
    public TodoItemTaskDAOCollection(ArrayList<TodoItemTask> todoItemTasks) {
        this.todoItemTasks = todoItemTasks;
    }

    //methods
    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        todoItemTasks.add(todoItemTask);
        return todoItemTask;
    }

    @Override
    public TodoItemTask findById(int id) {
        for(TodoItemTask item: todoItemTasks){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    @Override
    public ArrayList<TodoItemTask> findAll() {
        return todoItemTasks;
    }

    @Override
    public ArrayList<TodoItemTask> findByAssignedStatus(boolean assigned) {
        ArrayList<TodoItemTask> todoItemTasksTemp = new ArrayList<>();
        for(TodoItemTask item: todoItemTasks){
            if(item.isAssigned() == assigned){
                todoItemTasksTemp.add(item);
            }
        }
        return todoItemTasksTemp;
    }

    @Override
    public ArrayList<TodoItemTask> findByPersonId(int personId) {
        ArrayList<TodoItemTask> todoItemTasksTemp = new ArrayList<>();
        for(TodoItemTask item: todoItemTasks){
            if(item.getAssignee().getId() == personId){
                todoItemTasksTemp.add(item);
            }
        }
        return todoItemTasksTemp;
    }

    @Override
    public void remove(int id) {
        for (TodoItemTask item : todoItemTasks) {
            if (item.getId() == id) {
                todoItemTasks.remove(item);
                break;
            }
        }
    }
}
