package se.lexicon;

import java.time.LocalDate;

public class TodoItem {

    //fields
    private int id;
    private String title;
    private String description;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    //constructor


    public TodoItem(int id, String title, String description, boolean done, LocalDate deadLine, Person creator) {
        this.id = id;
        setTitle(title);
        setDescription(description);
        setDone(done);
        setDeadLine(deadLine);
        setCreator(creator);
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setTitle(String title) {
        if(title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("title can't be null or empty");
        }
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    //other methods
    public boolean isOverdue(){
            return LocalDate.now().isAfter(deadLine);
    }

    public String getSummary(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(id).append(", Title: ")
                .append(title).append(", Description: ").append(description)
                .append(", Deadline: ").append(deadLine).append(", Done: ")
                .append(done).append(", Creator: ").append(creator);

        return sb.toString();
    }
}


