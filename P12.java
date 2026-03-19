package com.Atmiya;

class calc {
    int add(int a , int b) {
        return a+b;
    }
    int add(int a , int b, int c) {
        return a+b+c;
    }
}
class adv extends calc {
    int add(int a , int b) {
        System.out.println("Overridden");
        return a+b+10;
    }
}
public class P12 {
    static void main(String[] args) {
        calc c1 = new calc();
        System.out.println("add (10,20) = " + c1.add(10,20));
        System.out.println("add (10,20,30) = " + c1.add(10,20, 30));

        adv a1 = new adv();
        System.out.println("add (10,20) + 10 = " + a1.add(10,20));
    }
}
