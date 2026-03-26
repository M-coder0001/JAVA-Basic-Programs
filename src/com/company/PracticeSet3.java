package com.company;

public class PracticeSet3 {
    static void main() {
        // Question 1
        String name = "Mayank";
        name = name.toLowerCase();
        System.out.println(name);

        // Question 2
        String name1 = "Mayank Chandrapal";
        name1 = name1.replace(" ","_");
        System.out.println(name1);

        // Question 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Mayank");
        System.out.println(letter);

        // Question 4
        String MyString = "This string  contains   double and triple spaces";
        System.out.println(MyString.indexOf("  "));
        System.out.println(MyString.indexOf("     "));

        // Question 5
        String letter2 = "Dear Harry,\n\tThis \"JAVA\" course is nice.\n\tThanks!";
        System.out.println(letter2);

    }
}
