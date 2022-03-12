package com.company;

public class UserService {
    private static int index = 0;
    private static User[] users;

    public static void addId (User user) {
        if(user != null ){
            users[index] = user;
            index++;
        }

    }


}
