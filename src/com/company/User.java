package com.company;

public class User {
    private int id ;
    private String name;
    private int age;
    private String gender;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setId (int id){
        this.id = id;
    }
    long getId (){
        return id;
    }
    void setAge (int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    void setGender(String gender){
        this.gender = gender;
    }
    String getGender(){
        return gender;
    }
}
