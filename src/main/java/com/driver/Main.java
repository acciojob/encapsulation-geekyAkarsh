package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly rwOnly = new RWOnly();

        //System.out.println(rwOnly.name);

        rwOnly.setName("Geek");

        System.out.println(rwOnly.getName());
    }
}