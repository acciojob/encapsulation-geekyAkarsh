package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj = new RWOnly();

        // setting name value using setter -
        obj.setName("Geek");

        // getting name value using getter -
        System.out.println(obj.getName());
        // output - Geek
    }
}