package com.Atmiya;

public class P4_2 {
    static void main(String[] args) {
        int [][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Printing the 2D array");
        for (int i = 0; i<mat1.length; i++) {
            for (int j = 0; j<mat1[i].length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
