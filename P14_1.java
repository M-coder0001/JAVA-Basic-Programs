package com.Atmiya;

class animal1 {
    void eat() {
        System.out.println("Class animal1");
    }
}
class dog1 extends animal1 {
    void display() {
        System.out.println("Class dog1");
    }
}
class cat extends animal1 {
    void show() {
        System.out.println("Class cat");
    }
}
public class P14_1 {
    static void main(String[] args) {
        dog1 d1 = new dog1();
        d1.eat();
        d1.display();

        cat c1 =new cat();
        c1.eat();
        c1.show();
    }
}
