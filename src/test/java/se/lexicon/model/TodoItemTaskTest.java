package se.lexicon.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTaskTest {

    @Test
    @DisplayName("Test setTodoItem with valid input")
    void setTodoItemSuccessfully() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );
        Person p2 = new Person("Kalle", "Kula", "kula@test.se" );
        TodoItem item1 = new TodoItem("Things to do", "description", LocalDate.now().plusMonths(1),p1);
        TodoItem item2 = new TodoItem("Other things to do", "description", LocalDate.now().plusMonths(2),p1);
        TodoItemTask task = new TodoItemTask(item1, p2);
        task.setTodoItem(item2);

        //expected
        TodoItem expectedItem = item2;

        //verify
        assertEquals(expectedItem, task.getTodoItem());
    }

    @Test
    @DisplayName("Test setTodoItem Null")
    void setTodoItemNull() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );
        Person p2 = new Person("Kalle", "Kula", "kula@test.se" );
        TodoItem item1 = new TodoItem("Things to do", "description", LocalDate.now().plusMonths(1),p1);
        TodoItemTask task = new TodoItemTask(item1, p2);

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    task.setTodoItem(null);
                });
    }

    @Test
    @DisplayName("test setAssignee with valid input")
    void setAssigneeSuccessfully() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );
        Person p2 = new Person("Kalle", "Kula", "kula@test.se" );
        TodoItem item1 = new TodoItem("Things to do", "description", LocalDate.now().plusMonths(1),p1);

        TodoItemTask task = new TodoItemTask(item1, p1);
        task.setAssignee(p2);

        //expected
        Person expectedAssignee = p2;

        //verify
        assertTrue(task.isAssigned());
        assertEquals(expectedAssignee, task.getAssignee());

    }

    @Test
    @DisplayName("Test setAssignee Null")
    void setAssigneeNull() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );
        TodoItem item1 = new TodoItem("Things to do", "description", LocalDate.now().plusMonths(1),p1);
        TodoItemTask task = new TodoItemTask(item1, p1);

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    task.setAssignee(null);
                });
    }
}