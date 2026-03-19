package com.Atmiya;

interface A {
    void showA();
}
interface B {
    void showB();
}
class C implements A,B {
    public void showA() {
        System.out.println("Interface A");
    }
    public void showB() {
        System.out.println("Interface B");
    }
}
public class P15_1 {
    static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}
