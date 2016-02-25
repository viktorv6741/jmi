package com;

public class User {

    private String name;
    private String surname;
    private int age;

///////////////////////////////////////////////////////////////

    public User(String name, String surname, int age) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public User() {
    }

///////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
