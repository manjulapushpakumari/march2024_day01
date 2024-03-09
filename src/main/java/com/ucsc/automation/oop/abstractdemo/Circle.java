package com.ucsc.automation.oop.abstractdemo;

public class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("draw a circle");
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.color();
        circle.draw();
    }
}
