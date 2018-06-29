package com.singtel.java.basis;


public class Dolphins implements Animal {
    private Fish fish = null;

    public Dolphins(Fish fish) {
        this.fish = fish;
    }

    public Fish getDolphins() {
        return this.fish;
    }

    public void setDolphins(Fish fish) {
        this.fish = fish;
    }

    public boolean walk() {
        return fish.walk();
    }

    public boolean sing() {
        return fish.sing();
    }

    public boolean fly() {
        return fish.fly();
    }

    public boolean swim() {
        this.fish.swim();
        System.out.println("Good swimer");
        return true;
    }
}