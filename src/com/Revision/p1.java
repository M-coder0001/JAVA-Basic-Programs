package com.Revision;

interface A {
    void showA();
}
interface B {
    void showB();
}
class C implements A,B {
    @Override
    public void showA() {
        System.out.println("This is interface A");
    }
    public void showB() {
        System.out.println("This is interface B");
    }
}
public class p1 extends C {
    static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}
