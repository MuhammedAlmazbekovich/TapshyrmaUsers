package com.company;

public class UserService {
    private static int index = 0;
    private static User[] users;


    public  void addId(User user1) {
        if(users != null ){
            users[index] = user1;
            index++;
        }

    }


}
