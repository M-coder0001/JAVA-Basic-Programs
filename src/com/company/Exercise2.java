package com.company;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Exercise2 {
     static void main(String[] args) {
//        Creating ROCK,PAPER,SCISSORS game
//        for this I need to generate a random number between 0 and 3
//        0 is for ROCK, 1 is for PAPER and 2 is for SCISSORS
//        For random numbers I import a class RANDOM
//        Math.random() returns a random number between 0.0, and 1.0
        System.out.println("THIS IS A SIMULATION GAME SET IN A VIRTUAL WORLD😂\n " +
                            "\tPLEASE PLAY IN MODERATION,\n \t\tTAKE FREQUENT BREAKS,\n " +
                            "\t\t\tAND PLAY RESPONSIBLY🤨");
        System.out.println("THIS IS ROCK,PAPER,SCISSORS GAME!");
        System.out.println("0 is ROCK✊");
        System.out.println("1 is PAPER✋");
        System.out.println("2 is SCISSOR✌️");

        int humanWins = 0;
        int computerWins = 0;
        int draws = 0;

        Scanner sc = new Scanner(System.in);
        int temp = 0;
        while (temp < 3) {
            temp++;

            System.out.println("Human enter your choice");
            int Human = sc.nextInt();
            System.out.println("Human choose " + Human);

            int Computer = (int)(Math.random() * 2); // 0 to 100
            System.out.println("Computer choose " + Computer);

            switch (Human) {
                case 0 -> System.out.println("HUMAN👱 -> ROCK✊");
                case 1 -> System.out.println("HUMAN👱 -> PAPER✋");
                case 2 -> System.out.println("HUMAN👱 -> SCISSOR✌️");
                default -> System.out.println("INVALID CHOICE 😡");
            }

            switch (Computer) {
                case 0 -> System.out.println("COMPUTER💻 -> ROCK✊");
                case 1 -> System.out.println("COMPUTER💻 -> PAPER✋");
                case 2 -> System.out.println("COMPUTER💻 -> SCISSOR✌️");
                default -> System.out.println("INVALID CHOICE 😡");
            }

            if (Human == 0 && Computer == 1) {
                System.out.println("COMPUTER wins🌟");
                computerWins++;
                System.out.println("---------------------");
            }
            else if (Human == 0 && Computer == 2) {
                System.out.println("HUMAN wins🌟");
                humanWins++;
                System.out.println("---------------------");
            }
            else if (Human == 0 && Computer == 0) {
                System.out.println("DRAW⚖️");
                draws++;
                System.out.println("---------------------");
            }
            else if (Human == 1 && Computer == 0) {
                System.out.println("HUMAN wins🌟");
                humanWins++;
                System.out.println("---------------------");
            }
            else if (Human == 1 && Computer == 2) {
                System.out.println("COMPUTER wins🌟");
                computerWins++;
                System.out.println("---------------------");
            }
            else if (Human == 1 && Computer == 1) {
                System.out.println("DRAW⚖️");
                draws++;
                System.out.println("---------------------");
            }
            else if (Human == 2 && Computer == 0) {
                System.out.println("COMPUTER wins🌟");
                computerWins++;
                System.out.println("---------------------");
            }
            else if (Human == 2 && Computer == 1) {
                System.out.println("HUMAN wins🌟");
                humanWins++;
                System.out.println("---------------------");
            }
            else if (Human == 2 && Computer == 2) {
                System.out.println("DRAW⚖️");
                draws++;
                System.out.println("---------------------");
            }
        }

        System.out.println("\n=====================");
        System.out.println("    FINAL RESULT    ");
        System.out.println("=====================");

        System.out.println("Human wins: " + humanWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Draws: " + draws);

        if (humanWins > computerWins) {
            System.out.println("Overall Winner: HUMAN 🎉👱");
        }
        else if (computerWins > humanWins) {
            System.out.println("Overall Winner: COMPUTER 🤖🏆");
        }
        else {
            System.out.println("Match Tie! ⚖️");
        }
    }
}
