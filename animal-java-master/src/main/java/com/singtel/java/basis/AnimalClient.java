package com.singtel.java.basis;


public class AnimalClient {

    public static void main(String... args) {

        Animal[] animals = {
                new Duck(),

                new Chicken(),

                new Rooster("nl").getChicken(),

                new Parrot(),

                new Parrot("Woof, woof"),

                new Parrot("Meow"),

                new Parrot("Cock-a-doodle-doo"),

                new Shark(),

                new Clownfish (),

                new Dolphins(new Fish()),

                new Butterfly(),

                new Caterpillar()
        };

        for(Animal animal: animals) {
            System.out.println(animal +"-" + animal.sing());
        }
    }
}