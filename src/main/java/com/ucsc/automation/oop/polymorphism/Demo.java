package com.ucsc.automation.oop.polymorphism;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Animal animalDog = new Dog();
        animalDog.makeSound();
    }
}
