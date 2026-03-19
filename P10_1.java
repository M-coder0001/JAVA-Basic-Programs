package com.Atmiya;

class test {
    int a,b;
    test(int i, int j) {
        a = i;
        b = j;
    }
    void equal(test t) {
        if (a==t.a &&  b==t.b) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
public class P10_1 {
    static void main(String[] args) {
        test t1 = new test(10,20);
        test t2 = new test(10,20);
        test t3 = new test(30,40);

        t1.equal(t2);
        t2.equal(t3);
    }
}
