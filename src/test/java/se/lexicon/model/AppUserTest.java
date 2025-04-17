package se.lexicon.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppUserTest {

    @Test
    @DisplayName("Test setUsername with valid input")
    void setUsername() {

        //scenario
        AppUser a1 = new AppUser("test123", AppRole.ROLE_APP_ADMIN, "password");
        a1.setUsername("Kalle321");

        //expected
        String expected = "Kalle321";

        //verify
        assertEquals(expected, a1.getUsername());
    }

    @Test
    @DisplayName("Test setUsername null")
    void setUsernameNull() {

        //scenario
        AppUser a1 = new AppUser("test123", AppRole.ROLE_APP_ADMIN, "password");

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    a1.setUsername(null);
                });
    }

    @Test
    @DisplayName("Test setUsername empty")
    void setUsernameEmpty() {

        //scenario
        AppUser a1 = new AppUser("test123", AppRole.ROLE_APP_ADMIN, "password");

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    a1.setUsername("");
                });
    }

    @Test
    @DisplayName("Test setPassword with valid input")
    void setPassword() {

        //scenario
        AppUser a1 = new AppUser("test123", AppRole.ROLE_APP_ADMIN, "password");
        a1.setPassword("pw123");

        //expected
        String expected = "pw123";

        //verify
        assertEquals(expected, a1.getPassword());
    }

    @Test
    @DisplayName("Test setPassword null")
    void setPasswordNull() {

        //scenario
        AppUser a1 = new AppUser("test123", AppRole.ROLE_APP_ADMIN, "password");

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    a1.setPassword(null);
                });
    }

    @Test
    @DisplayName("Test setPassword empty")
    void setPasswordEmpty() {

        //scenario
        AppUser a1 = new AppUser("test123", AppRole.ROLE_APP_ADMIN, "password");

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    a1.setPassword("");
                });
    }

    @Test
    @DisplayName("Test setRole to change roll from user to admin")
    void setRoleToAdmin() {

        //scenario
        AppUser a1 = new AppUser("test123", AppRole.ROLE_APP_USER, "password");
        a1.setRole(AppRole.ROLE_APP_ADMIN);

        //expected
        AppRole expected = AppRole.ROLE_APP_ADMIN;

        //verify
        assertEquals(expected, a1.getRole());
    }

    @Test
    @DisplayName("Test setRole null")
    void setRoleNull() {

        //scenario
        AppUser a1 = new AppUser("test123", AppRole.ROLE_APP_USER, "password");

        //verify
        assertThrows(IllegalArgumentException.class,
                () -> {
                    a1.setRole(null);
                });
    }
}