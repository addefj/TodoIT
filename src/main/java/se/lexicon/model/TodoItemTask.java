package se.lexicon.model;

import se.lexicon.sequencers.TodoItemTaskIdSequencer;

import java.util.Objects;

public class TodoItemTask {

    //fields
    private final int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    //constructor
    public TodoItemTask(int id, TodoItem todoItem, Person assignee) {
        this.id = TodoItemTaskIdSequencer.nextId();
        setTodoItem(todoItem);
        setAssignee(assignee);
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setTodoItem(TodoItem todoItem) {
        if(todoItem == null){
            throw new IllegalArgumentException("todoItem can't be null");
        }
        this.todoItem = todoItem;
    }

    public void setAssignee(Person assignee) {
        if(assignee != null){
            this.assigned = true;
        }
        this.assignee = assignee;
    }

    //other methods

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TodoItemTask that = (TodoItemTask) o;
        return id == that.id && assigned == that.assigned && Objects.equals(todoItem, that.todoItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, todoItem);
    }

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", todoItem=" + todoItem +
                '}';
    }
}
