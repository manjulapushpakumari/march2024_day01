package com.ucsc.automation;

public class ThisDemo {
    int x = 1;

    void display(int x){
        System.out.println("local x : "+ x);
        System.out.println("Global x : "+ this.x);
    }

    public static void main(String[] args) {
        ThisDemo thisDemo =
                new ThisDemo();
        thisDemo.display(5);
    }

}
