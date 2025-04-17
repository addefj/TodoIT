package se.lexicon.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("Test setFirstName with a valid input")
    void setFirstNameSuccessfully() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );
        p1.setFirstName("Kalle");

        //expected
        String expectedFirstName = "Kalle";

        //verify
        assertEquals(expectedFirstName, p1.getFirstName());
    }

    @Test
    @DisplayName("Test setFirstName null")
    void setFirstNameNull() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    p1.setFirstName(null);
                });
    }

    @Test
    @DisplayName("Test setFirstName empty")
    void setFirstNameEmpty() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    p1.setFirstName("");
                });
    }

    @Test
    @DisplayName("Test setLastName with a valid input")
    void setLastNameSuccessfully() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );
        p1.setLastName("Kula");

        //expected
        String expectedLastName = "Kula";

        //verify
        assertEquals(expectedLastName, p1.getLastName());
    }

    @Test
    @DisplayName("Test setLastName null")
    void setLastNameNull() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    p1.setLastName(null);
                });
    }

    @Test
    @DisplayName("Test setLastName empty")
    void setLastNameEmpty() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    p1.setLastName("");
                });
    }

    @Test
    @DisplayName("Test setEmail with valid input")
    void setEmailSuccessfully() {
        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );
        p1.setEmail("test@gmail.com");

        //expected
        String expectedEmail = "test@gmail.com";

        //verify
        assertEquals(expectedEmail, p1.getEmail());
    }

    @Test
    @DisplayName("Test setEmail null")
    void setEmailNull() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    p1.setEmail(null);
                });
    }

    @Test
    @DisplayName("Test setEmail empty")
    void setEmailEmpty() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    p1.setEmail("");
                });
    }

    @Test
    @DisplayName("Test setEmail invalid format, no @")
    void setEmailInvalidFormatNoAt() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    p1.setEmail("test.testing.se");
                });
    }

    @Test
    @DisplayName("Test setEmail invalid format, extra dot after @")
    void setEmailInvalidFormatDoubleDots() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    p1.setEmail("test@testing..se");
                });
    }

    @Test
    @DisplayName("Test setting credentials from AppUser to Person")
    void setCredentialsSuccessfully() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );
        AppUser a1 = new AppUser("user123", AppRole.ROLE_APP_USER, "pw123");
        p1.setCredentials(a1);

        //verify
        assertNotNull(p1.getCredentials());
        assertEquals(a1, p1.getCredentials());
    }

    @Test
    @DisplayName("Test setting credentials Null")
    void setCredentialsNull() {

        //scenario
        Person p1 = new Person("Test", "Testsson", "test@test.se" );

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    p1.setCredentials(null);
                });
    }
}