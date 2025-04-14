package se.lexicon.data;

import se.lexicon.model.Person;

import java.util.ArrayList;

public interface IPersonDAO {

    //methods
    Person persist(Person person);
    Person findById(int id);
    Person findByEmail(String email);
    ArrayList<Person> findAll(Person person);
    void remove(int id);
}
