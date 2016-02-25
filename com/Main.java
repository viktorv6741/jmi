package com;

public class Main {
    public static void main(String[] args) {

        User user = new User("Name", "Surname", 25);
        getSize(user);

    }

    static {
        System.load("source.dll");
    }

    public static native int getSize(User user);
}
