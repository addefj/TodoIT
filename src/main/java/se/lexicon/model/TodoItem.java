package se.lexicon.model;

import se.lexicon.sequencers.TodoItemSequencer;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {

    //fields
    private final int id;
    private String title;
    private String description;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    //constructor
    public TodoItem(String title, String description, LocalDate deadLine, Person creator) {
        this.id = TodoItemSequencer.nextId();
        setTitle(title);
        setDescription(description);
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
        if (title == null || title.trim().isEmpty()) throw new IllegalArgumentException("title can't be null or empty");
        this.title = title;
    }

    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) throw new IllegalArgumentException("description can't be null or empty");
        this.description = description;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null || LocalDate.now().isAfter(deadLine)) throw new IllegalArgumentException("deadLine can't be null or before today's date");
        this.deadLine = deadLine;
    }

    public void setCreator(Person creator) {
        if(creator == null) throw new IllegalArgumentException("creator can't be null");
        this.creator = creator;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    //other methods
    public boolean isOverdue() {
        return LocalDate.now().isAfter(deadLine);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && done == todoItem.done && Objects.equals(title, todoItem.title) && Objects.equals(description, todoItem.description) && Objects.equals(deadLine, todoItem.deadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, deadLine, done);
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "done=" + done +
                ", deadLine=" + deadLine +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}


