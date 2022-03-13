package com.company;

public class UserService {
    UserDao userdao = new UserDao();

    static  User[] users = new User [20];



    private static int index = 0;

    public static void addUser(User user) {
        if( user != null ){
            users[index] = user;
            index++;
        }
    }
}