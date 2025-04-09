package se.lexicon;

import se.lexicon.model.Person;

import java.util.ArrayList;

public class PersonDAO implements IPersonDAO{

    //fields
    ArrayList<Person> personList = new ArrayList<>();

//todo: choose right collection, add constructor, implement methods

    @Override
    public Person persist(Person person) {
        return null;
    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        return null;
    }

    @Override
    public ArrayList<Person> findAll(Person person) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
