package com.ucsc.automation;

public class LoopDemo {
    public static void main(String[] args) {

        /**
         * break and continue
         */
        for(int x=0; x<5; x++){
            if(x==2){
                /**
                 * Either break or continue
                 */
                break;
//                continue;
            }
            System.out.println(x);
        }

        /**
         * do-while loop
         */
//        int count = 0;
//        do{
//            System.out.println(count);
//            count++;
//        }while (count<5);


        /**
         * While loop
         */
//        int count = 0;
//        while(count<5){
//            System.out.println(count);
//            count++;
//        }


        /**
         * Iterate array via enhance for loop
         */
//        int[] arr = {5, 3, 9, 8};
//        for(int x : arr){
//            System.out.println(x);
//        }

        /**
         * Iterate array over for loop
         */
//        int[] arr = {5, 3, 9, 8};
//        for(int x = 0; x<arr.length; x++){
//            System.out.println(arr[x]);
//        }

        /**
         * Normal for loop
         */
//        int x = 0;
//        for(; x<4; x++){
//            System.out.println(x);
//        }
    }
}
