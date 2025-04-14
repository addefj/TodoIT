package se.lexicon.data;

import se.lexicon.model.AppUser;

import java.util.ArrayList;

public interface IAppUserDAO {

    //methods
    AppUser persist(AppUser appUser);
    AppUser findByUsername(String username);
    ArrayList<AppUser> findAll();
    void remove(String username);


}
