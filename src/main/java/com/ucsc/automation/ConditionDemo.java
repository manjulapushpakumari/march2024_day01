package com.ucsc.automation;

public class ConditionDemo {
    public static void main(String[] args) {

        int day = 3;
        String dayName;

        switch (day){
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println(dayName);


        /**
         * Nested if condition
         */
//        int x = 5;
//        int y = 3;
//
//        if(x>2){
//            if(y<5){
//                System.out.println("Yes");
//            }else{
//                System.out.println("No");
//            }
//        }else {
//            System.out.println("No");
//        }


        /**
         * if else-if conditions
         */
//        int age = 39;
//        if(age<18){
//            System.out.println("child");
//        }else if(age<40){
//            System.out.println("mid age");
//        }else{
//            System.out.println("matured");
//        }

        /**
         * if condition with else
         */
//        int x = 1;
//
//        if(x > 2){
//            System.out.println("Greater");
//        }else {
//            System.out.println("Less");
//        }
    }
}
