package se.lexicon;

import se.lexicon.model.Person;

import java.util.ArrayList;

public interface IPersonDAO {

    //fields
    ArrayList<Person> personList = new ArrayList<>();

    //methods
    Person persist(Person person);
    Person findById(int id);
    Person findByEmail(String email);
    ArrayList<Person> findAll(Person person);
    void remove(int id);
}
