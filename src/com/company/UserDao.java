package com.company;

public class UserDao {
    private User[] users = new User[20];

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
