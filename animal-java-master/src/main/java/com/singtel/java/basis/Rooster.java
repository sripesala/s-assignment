package com.singtel.java.basis;


public class Rooster {
    private String sound = "Cock-a-doodle-doo";

    private Chicken chicken = null;

    public Rooster() {
        chicken = new Chicken(sound);
    }

    public Rooster(String lang) {
        sound = Util.getInstance().getMessageSound(lang);
        chicken = new Chicken(sound);
    }

    public Chicken getChicken() {
        return chicken;
    }

    public void setChicken(Chicken chicken) {
        this.chicken = chicken;
    }

    public boolean walk() {
        return chicken.walk();
    }

    public boolean sing() {
        return chicken.sing();
    }

    public boolean fly() {
        return chicken.fly();
    }

    public boolean swim() {
        return chicken.swim();
    }
}
