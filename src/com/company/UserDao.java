package com.company;

public class UserDao {
    static User[] users = new User [20];



    User [] getUser() {
        return users;
    }

    public void setUser (User[] users) {
        this.users = users;
    }



}