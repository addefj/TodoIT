package se.lexicon;

import se.lexicon.model.AppUser;

import java.util.ArrayList;

public class AppUserDAO implements IAppUserDAO{

    //fields
    ArrayList<AppUser> userList = new ArrayList<>();

    //todo: choose right collection, add constructor, implement methods

    //methods
    @Override
    public AppUser persist(AppUser appUser) {
        return null;
    }

    @Override
    public AppUser findByUsername(String username) {
        return null;
    }

    @Override
    public ArrayList<AppUser> findAll() {
        return null;
    }

    @Override
    public void remove(AppUser username) {

    }
}
