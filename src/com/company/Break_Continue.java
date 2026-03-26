package com.company;

public class Break_Continue {
    static void main(String[] args) {
        // Break and continue using loops

        // 1. BREAK
        for (int i=0; i<=5; i++) {
            System.out.println(i);
            if (i == 3) {
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("--------------------------------------");
        // 2. CONTINUE
        for (int i=0; i<=5; i++) {
            if (i == 3) {
                System.out.println("Skipping three (3)");
                continue;
            }
            System.out.println(i);
        }

    }
}
