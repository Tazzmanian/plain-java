package com.composition;

public class Bathroom {

    private Tub tub;
    private int size;

    public Tub getTub() {
        return tub;
    }

    public void setTub(Tub tub) {
        this.tub = tub;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
