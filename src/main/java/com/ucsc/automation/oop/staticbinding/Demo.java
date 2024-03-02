package com.ucsc.automation.oop.staticbinding;

public class Demo {
    public static void main(String[] args) {
        Food food = new Food();
        Banana banana = new Banana();
        Food foodBanana = new Banana();

        Monkey m1 = new Monkey();
        Monkey m2 = new Monkey();
        Monkey m3 = new Monkey();

        m1.eat(food);
        m2.eat(banana);
        m3.eat(foodBanana);
    }
}
