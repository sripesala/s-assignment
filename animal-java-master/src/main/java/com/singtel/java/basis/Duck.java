package com.singtel.java.basis;


public class Duck extends Bird {
    public boolean sing() {
        System.out.println("Quack, quack");
        return true;
    }

    public boolean swim() {
        System.out.println("I can swim");
        return true;
    }
}

