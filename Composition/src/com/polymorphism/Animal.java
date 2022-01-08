package com.polymorphism;

public class Animal {

    private String name;

    void makeSound() {
        System.out.println("grrr");
    }

    void makeSound(String sound) {
        System.out.println(sound);
    }
}
