package com.Revision;

class A2 {
    void show() {
        System.out.println("This is class A");
    }
}
class B2 extends A2 {
    void show() {
        System.out.println("This is class B");
    }
}
class C2 extends A2 {
    void show() {
        System.out.println("This is class C");
    }
}
public class P3 {
    static void main(String[] args) {
        A2 a = new A2();
        B2 b = new B2();
        C2 c = new C2();

        A2 m;

        m = a;
        m.show();

        m = b;
        m.show();

        m = c;
        m.show();
    }
}
