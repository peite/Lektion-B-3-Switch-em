package com.peter.demo;

import static com.peter.demo.Colors.*; // Stjärna = import av ALLA variabler, rubbet!

public class Main {
    public static void main(String[] args) {

        Cat Franz = new Cat();
        Dog Boris = new Dog();

        Franz.eat();
        Franz.makeSound();
        Franz.sleep();
        Franz.excrete(); // Default method

        System.out.println("\n");

        Boris.eat();
        Boris.makeSound();
        Boris.sleep();
        Boris.excrete(); // Default method

        String name = "Benny";
        // Red: "\033[0;31m";
        // Color reset: "\033[0m" or "\u001B[0m"
        System.out.println("Text " + RED  + "Text");
        System.out.println("Text2 " + RESET + "Text:reset");
        System.out.println(BLUE_BOLD + "BLUE BOLD" + RESET);

        System.out.printf("I'm %s Blue %s and I %s am %s Green", BLUE, RESET, name, GREEN, RESET);

    // ett interface är en abstrakt klass som låter oss skapa abstrakta metoder


    }
}
