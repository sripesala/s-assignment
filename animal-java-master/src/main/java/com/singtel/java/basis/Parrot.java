package com.singtel.java.basis;


public class Parrot extends Bird {
    private String sing = "";

    public Parrot() {
    }

    public Parrot(String sing) {
        this.sing = sing;
    }

    public boolean sing() {
        System.out.println(this.sing);
        return true;
    }
}
