package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj = new RWOnly();
        obj.name = "new name";
        System.out.println(obj.name);
        // error - java: name has private access in com.driver.RWOnly
    }
}