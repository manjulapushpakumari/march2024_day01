package com.ucsc.automation.pkgone;

public class DemoTwo {

    void display(){
        DemoOne demoOne = new DemoOne();
        /**
         * Cannot access x from here.
         */
//        System.out.println(demoOne.x);
        /**
         * Can access z variable
         * because it is in same package
         */
        System.out.println(demoOne.z);

        /**
         * variable a can be accessed,
         * because it is protected and
         * within the same package
         */
        System.out.println(demoOne.a);
    }
}
