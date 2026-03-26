package com.company;

public class PracticeSet6 {
    public static void main(String[] args) {
        /*
        // Question 1
        float [] arr1 = new float[5];
        arr1 [0] = 45.5f;
        arr1 [1] = 66.6f;
        arr1 [2] = 55.4f;
        arr1 [3] = 51.1f;
        arr1 [4] = 81.8f;

        System.out.println("value of array is");
        for (int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("=====");
        float sum = 0;
        for (float element:arr1) {
            sum = sum + element;
        }
        System.out.println("value of sum is");
        System.out.println(sum);
         */


        // Question 2
//        int [] marks ={10,55,44,56,48};
//        int num = 55;
//        boolean IsInArray = false;
//
//        for (int element:marks) {
//            if (num==element){
//                IsInArray = true;
//                break;
//            }
//        }
//        if (IsInArray) {
//            System.out.println(num + " is present in the array" );
//        }
//        else {
//            System.out.println(num + " is not present in the array" );
//        }


        // Question 3
        int [] marks = {10,55,44,56,48};
        float sum = 0;
        for (float element:marks) {
            sum = sum + element;
        }
        System.out.println("average marks value is " + sum/ marks.length);

        // Question 4
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{5, 14, 13},
                         {7, 8, 5}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i = 0; i<mat1.length; i++) {
            for (int j = 0; j<mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Printing the Result array");
        for (int i = 0; i<mat1.length; i++) {
            for (int j = 0; j<mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
