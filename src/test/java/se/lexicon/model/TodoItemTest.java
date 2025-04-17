package se.lexicon.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {

    @Test
    @DisplayName("Test setTitle with valid input")
    void setTitleSuccessfully() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        TodoItem item = new TodoItem("test", "description", LocalDate.now(), p1);
        item.setTitle("Todo 1");

        //expected
        String expectedTitle = "Todo 1";

        //verify
        assertEquals(expectedTitle, item.getTitle());

    }

    @Test
    @DisplayName("Test setTitle null")
    void setTitleNull() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        TodoItem item = new TodoItem("test", "description", LocalDate.now(), p1);

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    item.setTitle(null);
                });
    }

    @Test
    @DisplayName("Test setTitle empty")
    void setTitleEmpty() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        TodoItem item = new TodoItem("test", "description", LocalDate.now(), p1);

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    item.setTitle("");
                });
    }

    @Test
    @DisplayName("Test setDescription with valid input")
    void setDescriptionSuccessfully() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        TodoItem item = new TodoItem("test", "description", LocalDate.now(), p1);
        item.setDescription("this is a test description");

        //expected
        String expectedDescription = "this is a test description";

        //verify
        assertEquals(expectedDescription, item.getDescription());

    }

    @Test
    @DisplayName("Test setDescription null")
    void setDescriptionNull() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        TodoItem item = new TodoItem("test", "description", LocalDate.now(), p1);

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    item.setDescription(null);
                });

    }

    @Test
    @DisplayName("Test setDescription empty")
    void setDescriptionEmpty() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        TodoItem item = new TodoItem("test", "description", LocalDate.now(), p1);

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    item.setDescription("");
                });

    }

    @Test
    @DisplayName("Test setDeadLine with valid inpu")
    void setDeadLineSuccessfully() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        TodoItem item = new TodoItem("test", "description", LocalDate.now(), p1);
        item.setDeadLine(LocalDate.now().plusMonths(2));

        //expected
        LocalDate expectedDeadLine = LocalDate.now().plusMonths(2);

        //verify
        assertEquals(expectedDeadLine, item.getDeadLine());
    }

    @Test
    @DisplayName("Test setDeadLine Null")
    void setDeadLineNull() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        TodoItem item = new TodoItem("test", "description", LocalDate.now(), p1);

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    item.setDeadLine(null);
                });

    }

    @Test
    @DisplayName("Test setDeadLine to a date that has passed")
    void setDeadLineToPassedDate() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        TodoItem item = new TodoItem("test", "description", LocalDate.now(), p1);

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    item.setDeadLine(LocalDate.now().minusMonths(1));
                });

    }

    @Test
    @DisplayName("Test setCreator successfully to person 2")
    void setCreatorSuccessfully() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        Person p2 = new Person("Nils", "Hult", "hult@test.se");
        TodoItem item = new TodoItem("test", "description", LocalDate.now(), p1);
        item.setCreator(p2);

        //expected
       Person expectedCreator = p2;

        //verify
        assertEquals(expectedCreator, item.getCreator());

    }

    @Test
    @DisplayName("Test setCreator Null")
    void setCreatorNull() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        TodoItem item = new TodoItem("test", "description", LocalDate.now(), p1);

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    item.setCreator(null);
                });

    }

    @Test
    @DisplayName("Test if done is false default and if setDone sets done to true")
    void setDoneTest() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        TodoItem item = new TodoItem("test", "description", LocalDate.now(), p1);

        //verify
        assertFalse(item.isDone());
        item.setDone(true);
        assertTrue(item.isDone());
    }

    @Test
    @DisplayName("Test if isOverdue returns false if today is before deadLine")
    void isOverdueTest() {

        //scenario
        Person p1 = new Person("Kalle", "Kula", "kula@test.se");
        LocalDate deadLine = LocalDate.parse("2025-07-05");
        TodoItem item = new TodoItem("test", "description", deadLine, p1);

        //verify
        assertFalse(item.isOverdue());
    }
}