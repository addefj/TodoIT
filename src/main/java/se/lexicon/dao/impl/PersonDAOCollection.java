package se.lexicon.dao.impl;

import se.lexicon.dao.IPersonDAO;
import se.lexicon.model.Person;

import java.util.ArrayList;

public class PersonDAOCollection implements IPersonDAO {

    //fields
    ArrayList<Person> persons = new ArrayList<>();

    //constructor
    public PersonDAOCollection(ArrayList<Person> persons) {
        this.persons = persons;
    }

    //methods
    @Override
    public Person persist(Person person) {
        persons.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person person : persons) {
            if (person.getEmail().equalsIgnoreCase(email)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Person> findAll(Person person) {
        return persons;
    }

    @Override
    public void remove(int id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                persons.remove(person);
                break;
            }
        }
    }
}
