package com.singtel.java.basis;

public class Caterpillar extends FlyAnimal implements Animal {
    public boolean walk() {
        return true;
    }

    public boolean fly() {
        return false;
    }
}
