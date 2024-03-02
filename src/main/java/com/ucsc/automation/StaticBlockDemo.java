package com.ucsc.automation;

public class StaticBlockDemo {
    private static int x;

    static{
        x = 10;
    }

    void display(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        StaticBlockDemo staticBlockDemo =
                new StaticBlockDemo();
        staticBlockDemo.display();
    }
}
