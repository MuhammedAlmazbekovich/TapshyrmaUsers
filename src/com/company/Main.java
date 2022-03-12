package com.company;

public class Main {

    public static void main(String[] args) {

	User user2 = new User();
        user2.setId(9234);
        user2.setName("Misha");
        user2.setAge(16);
        user2.setGender("Male");

    User user1 = new User();
        user1.setId(1234);
        user1.setName("Masha");
        user1.setAge(45);
        user1.setGender("Female");

    User user3 = new User();
        user3.setId(5678);
        user3.setName("Ivan");
        user3.setAge(27);
        user3.setGender("Male");

        UserDao userDao = new UserDao();
        UserService userService = new UserService();




    }
}
