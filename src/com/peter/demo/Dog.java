package com.peter.demo;

public class Dog implements IAnimal {

    @Override
    public void makeSound() {
        System.out.println("Woff! woff!");
    }

    @Override
    public void eat() {
        System.out.println("Morf morf");

    }

    @Override
    public void sleep() {
        System.out.println("Herrzzzzz");
    }
}
