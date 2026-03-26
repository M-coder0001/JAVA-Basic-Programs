package com.Revision;

class A1 {
    void showA() {
        System.out.println("This is class A");
    }
}
class B1 extends A1{
    void showB() {
        System.out.println("This is class B");
    }
}
class C1 extends B1{
    void showC() {
        System.out.println("This is class C");
    }
}
public class P2 extends C1{
    static void main(String[] args) {
        P2 obj = new P2();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
