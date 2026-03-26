package com.company;

public class Arrays {
    public static void main(String[] args) {
        // we can create an array in 3 ways

        // 1.
//        int [] marks;             //Declaration
//        marks = new int[5];       // Memory allocation

        // 2.
//        int [] marks = new int[5];    //Declaration + Memory allocation

        //3.
//        int [] marks = {90,56,85,98,70}; // Declaration + initialization

        int [] marks = new int[5];
        marks [0] = 89;
        marks [1] = 69;
        marks [2] = 97;
        marks [3] = 84;
        marks [4] = 59;

//        System.out.println(marks[4]);

        // Displaying the array (FOR LOOP)
//        for (int i=0; i<marks.length; i++) {
//            System.out.println(marks[i]); //Array Traversal
//        }
//
//        System.out.println("----------------------------");
//        System.out.println("IN REVERSE ORDER");
//
//        for (int i= marks.length-1; i>=0; i--) {
//            System.out.println(marks[i]); //Array Traversal
//        }

        // Displaying the array (FOR EACH LOOP)

        /* syntax:
                for (int element : arr) {
                        sout(element);
                }
         */
        System.out.println("----------------------------");
        for (int element:marks) {
            System.out.println(element);
        }
    }


}
