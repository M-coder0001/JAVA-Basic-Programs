package com.Atmiya;

abstract class animal {
    abstract void sound();
    void eat() {
        System.out.println("Animal eat");
    }
}
class dog extends animal {
    void sound() {
        System.out.println("Dog eat");
    }
}
public class P11_1 {
    static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.eat();
    }
}
