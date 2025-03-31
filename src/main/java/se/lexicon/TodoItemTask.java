package se.lexicon;

public class TodoItemTask {

    //fields
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    //constructor
    public TodoItemTask(int id, TodoItem todoItem, Person assignee) {
        this.id = id;
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
    public String getSummary(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(id).append(", TodoItem: ")
                .append(todoItem).append(", Assignee: ")
                .append(assignee).append(", Assigned: ")
                .append(assigned);

        return sb.toString();
    }
}
