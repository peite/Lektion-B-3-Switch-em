package com.peter.demo;

public interface IAnimal {

    // parentclass för vad alla djur kan göra
    void makeSound();
    void eat();
    void sleep();

    // poop (en färdighet alla kan)
    default void excrete() {
        System.out.println(" It's happening... ");
    }


}
