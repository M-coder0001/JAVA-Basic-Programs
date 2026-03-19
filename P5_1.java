package com.Atmiya;

public class P5_1 {
    static void main(String[] args) {
        //String Operations
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("String Operations:");
        System.out.println("stri: " + str1);
        System.out.println("str2: " + str2);

        // Concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenation: " + str3);

        // Length of string
        System.out.println("Length of str3: " + str3.length());

        // Character at index
        System.out.println("Character at index 1 of strl: " + str1.charAt(1));

        // Substring
        System.out.println("Substring of str3 (1 to 5): " + str3.substring(0,5));

        // Compare two strings
        System.out.println("strl equals str2? " + str1.equals(str2));

        //StringBuffer Operations
        StringBuffer sb = new StringBuffer("Java");
        System.out.println("\nStringBuffer Operations:");
        System.out.println("Original StringBuffer: " + sb);

        // Append
        sb.append(" Programming");
        System.out.println("After append: " + sb);
        // Insert
        sb.insert(5, "Language");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(0, 4, "Python");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(6, 15);
        System.out.println("After delete: " + sb);
    }
}
