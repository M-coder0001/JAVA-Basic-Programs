package com.Atmiya;
import java.io.*;

public class P22 {
    static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello, This is a file I/O Demo in java");

            fw.close();
            System.out.println("Data writes successdfully");

            FileReader fr = new FileReader("sample.txt");
            int ch;
            System.out.println("File content");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
