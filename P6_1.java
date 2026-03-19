package com.Atmiya;

public class P6_1 {
    static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Arithmatic operator");
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a * b = " + (a*b));
        System.out.println();

        System.out.println("Relational operator");
        System.out.println("a < b = " + (a<b));
        System.out.println("a > b = " + (a>b));
        System.out.println("a <= " + (a<=b));
        System.out.println("a >= " + (a>=b));
        System.out.println("a == b " + (a==b));
        System.out.println("a != b " + (a!=b));
        System.out.println();

        System.out.println("Logical operator");
        boolean x = true, y  = false;
        System.out.println("x && y = " + (x&&y));
        System.out.println("x || y = " + (x||y));
        System.out.println("!x = " + (!x));
        System.out.println();

        System.out.println("Unary operator");
        int c = 5;
        System.out.println(c);
        System.out.println("Pre increment = " + ++c);
        System.out.println("Post increment = " + c++);
        System.out.println();

        System.out.println("Assignment operator");
        int d = 10;
        d += 5;
        System.out.println(d);
        d -= 3;
        System.out.println(d);
        d *= 2;
        System.out.println(d);
        d %= 3;
        System.out.println(d);


    }
}
