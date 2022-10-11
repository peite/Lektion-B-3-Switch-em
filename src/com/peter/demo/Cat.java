package com.peter.demo;

public class Cat implements IAnimal {

    // default excrete (poop) finns med under huven i Cat och Dog!

    @Override
    public void makeSound() {
        System.out.println("Meow!");

    }

    @Override
    public void eat() {
        System.out.println("Nom nom nom");

    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz");
    }
}
