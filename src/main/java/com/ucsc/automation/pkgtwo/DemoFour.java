package com.ucsc.automation.pkgtwo;

import com.ucsc.automation.pkgone.DemoOne;

public class DemoFour extends DemoOne {
    void display(){
        /**
         * variable "a" is protected and
         * DemoFour is extended from the
         * DemoOne
         */
        System.out.println(a);
    }
}
