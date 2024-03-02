package com.ucsc.automation.pkgtwo;

import com.ucsc.automation.pkgone.DemoOne;

public class DemoThree {

    void display(){
        /**
         * Can access y from DemoOne
         * because it is public
         */
        DemoOne demoOne =
                new DemoOne();
        System.out.println(demoOne.y);
        /**
         * cannot access z variable
         * because it is from
         * separate package
         */
//        System.out.println(demoOne.z);
        /**
         * Cannot access a because it is
         * in outside package
         */
//        System.out.println(demoOne.a);
    }
}
