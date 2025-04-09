package se.lexicon.model;

import se.lexicon.AppRole;

import java.util.Objects;

public class AppUser {

    //fields
    private String username;
    private String password;
    private AppRole role;

    //constructor
    public AppUser(String username, AppRole role, String password) {
        setUsername(username);
        setPassword(password);
        setRole(role);
    }

    //getters and setters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setUsername(String username) {
        if(username == null || username.trim().isEmpty()){
            throw new IllegalArgumentException("username can't be null or empty");
        }
        this.username = username;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()){
            throw new IllegalArgumentException("password can't be null or empty");
        }
        this.password = password;
    }

    public void setRole(AppRole role) {
        if(role == null){
            throw new IllegalArgumentException("role can't be null");
        }
        this.role = role;
    }

    //other methods
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }

}
