package com.company;

import static com.company.UserDao.users;
import static com.company.UserService.addUser;

public class Main {


    public static void main(String[] args) {


//        UserService userService = new UserService();
//        UserDao userdao = new UserDao();
        users[0] = new User();
        users[1] = new User();
        users[2] = new User();
        users[3] = new User();




        User user0 = new User();
        user0.setId(9234);
        user0.setName("Misha");
        user0.setAge(16);
        user0.setGender("Male");

        User user1 = new User();
        user1.setId(1234);
        user1.setName("Masha");
        user1.setAge(45);
        user1.setGender("Female");

        User user2 = new User();
        user2.setId(5678);
        user2.setName("Ivan");
        user2.setAge(27);
        user2.setGender("Male");

        addUser(user2);
        System.out.println(users[12].getName());
    }
}