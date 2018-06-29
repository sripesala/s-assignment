package com.singtel.java.basis;


public class Butterfly extends FlyAnimal implements Animal {
    public boolean walk() {
        return false;
    }

    public boolean fly() {
        return true;
    }
}