package com.singtel.java.basis;


public class Fish implements Animal {
    enum SIZE {
        SMALL, LARGE, NORMAL
    }

    ;

    enum COLOR {
        GREY, ORANGE, BLACK
    }

    ;

    public boolean walk() {
        return false;
    }

    public boolean sing() {
        return false;
    }

    public boolean swim() {
        return true;
    }

    public boolean fly() {
        return false;
    }

    public SIZE size() {
        return SIZE.NORMAL;
    }

    public COLOR color() {
        return COLOR.BLACK;
    }
}
