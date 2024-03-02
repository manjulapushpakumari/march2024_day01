package com.ucsc.automation;

public class StaticKeyword {

    public int counter;
    public static int staticCounter;

    public StaticKeyword(){
        counter++;
        staticCounter++;
    }

    public void display(){
        System.out.println("counter : "+ counter);
        System.out.println("staticCounter : "+ staticCounter);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        StaticKeyword staticKeyword_1 =
                new StaticKeyword();
        staticKeyword_1.display();

        StaticKeyword staticKeyword_2 =
                new StaticKeyword();
        staticKeyword_2.display();

        StaticKeyword staticKeyword_3 =
                new StaticKeyword();
        staticKeyword_3.display();

    }
}
