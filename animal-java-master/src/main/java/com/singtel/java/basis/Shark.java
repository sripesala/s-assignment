package com.singtel.java.basis;

public class Shark extends Fish {
    public SIZE size() {
        return SIZE.LARGE;
    }

    public COLOR color() {
        return COLOR.GREY;
    }

    public void eat() {
        System.out.println("Eat other fish");
    }
}