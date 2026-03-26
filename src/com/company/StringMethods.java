package com.company;

public class StringMethods {
    static void main() {
        //----------1. String Length-----------
        String name = "Mayank";
//        int val = name.length();  //name.length() returns the length of the string
//        System.out.println(val);

        //----------2. String into lowercase----------
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);

        //----------3. String into Uppercase----------
//        String Ustring = name.toUpperCase();
//        System.out.println(Ustring);
//
//        //----------4. String Trim----------
//        String NonTrimmed = "      helloo    world  ";
//        System.out.println(NonTrimmed);
//
//        String Trimmed = NonTrimmed.trim(); // .timm() will remove the extra spaces from the string
//        System.out.println(Trimmed);
//        System.out.println(NonTrimmed.trim()); //we can write in both ways

        //----------5. Substring()----------
        System.out.println(name.substring(2)); //returns the string from the beginIndex to endIndex
        System.out.println(name.substring(2,5)); // 2 is starting index and 5 is ending index it will do not include 5th index

        //----------6. String char replace----------
        System.out.println(name.replace('a','b'));
        System.out.println(name.replace("ayank","anya"));

        //----------6. StartsWith()----------
        System.out.println(name.startsWith("Ma"));

        //----------6. EndsWith()----------
        System.out.println(name.endsWith("Ma"));

        //----------6. charAt()----------
        System.out.println(name.charAt(2)); //returns the character at the index

        //----------6. indexOf()----------
        System.out.println(name.indexOf('y')); //returns the index of given char
        String ModifiedName = "Mayankank";
        System.out.println(ModifiedName.indexOf("ank",5)); //returns the index of given char from 1st index
        //if there is no substring then it will return -1

        //----------7. lastIndexOf()----------
        System.out.println(ModifiedName.lastIndexOf("ank",5)); //lastIndexOf() read from backwards

        //----------6. Equals()----------
        System.out.println(name.equals("Mayank")); //compare both strings
        System.out.println(name.equalsIgnoreCase("mayanK")); //compare both strings no caseSensitive

        //Escape sequence char-----------------------------------------------------------------------------

        System.out.println("My name is blablabla, \"hello\""); //  (\") adds one double quote
        System.out.println("My name is blablabla, \\hello"); //  (\\) adds one backslash

    }
}
