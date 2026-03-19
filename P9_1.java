package com.Atmiya;

class stdcon {
    String name;
    int age;

    // Default Constructor
    stdcon() {
        name = "Hello";
        age = 20;
    }

    // Parameterized Constructor
    stdcon(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor
    stdcon(stdcon s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + " " + "Age: " + age);
    }
}

public class P9_1 {
    static void main(String[] args) {
        stdcon s1 = new stdcon();
        System.out.println("Default Constructor");
        s1.display();

        stdcon s2 = new stdcon("riya", 24);
        System.out.println("Parameterized Constructor");
        s2.display();

        stdcon s3 = new stdcon(s2);
        System.out.println("Copy Constructor");
        s3.display();
    }
}