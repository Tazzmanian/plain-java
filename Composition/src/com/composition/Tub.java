package com.composition;

public class Tub {
    private int size;
    private Bubble bubble;

    public Tub(int size) {
        this.size = size;
        this.bubble = new Bubble();
        bubble.setColor("blue");
        bubble.setRadius(2);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Bubble getBubble() {
        return bubble;
    }

    public void setBubble(Bubble bubble) {
        this.bubble = bubble;
    }
}
