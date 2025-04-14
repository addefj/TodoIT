package se.lexicon.model;

import se.lexicon.sequencers.PersonIdSequencer;

import java.util.Objects;

public class Person {

    //fields
    private final int id;
    private String firstName;
    private String lastName;
    private String email;
    AppUser credentials;

    //constructor
    public Person(String firstName, String lastName, String email) {
        this.id = PersonIdSequencer.nextId();
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("firstname can't be null or empty");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("lastname can't be null or empty");
        }
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("email can't be null or empty");
        }
        this.email = email;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    //other methods
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }
}
