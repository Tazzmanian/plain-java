package com.polymorphism;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.makeSound();
        dog.makeSound("Mew");

        Animal dog1 = new Dog();
        dog1.makeSound();
    }
}
