package se.lexicon.dao.impl;

import se.lexicon.dao.IAppUserDAO;
import se.lexicon.model.AppUser;

import java.util.ArrayList;

public class AppUserDAOCollection implements IAppUserDAO {

    //fields
    ArrayList<AppUser> users = new ArrayList<>();

    //constructor
    public AppUserDAOCollection(ArrayList<AppUser> userList) {
        this.users = userList;
    }


    //methods
    @Override
    public AppUser persist(AppUser appUser) {
        users.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        for (AppUser user: users){
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }


    @Override
    public ArrayList<AppUser> findAll() {
        return users;
    }

    @Override
    public void remove(String username) {
        for (AppUser user: users){
            if(user.getUsername().equals(username)){
                users.remove(user);
                break;
            }
        }
    }
}
