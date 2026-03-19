package com.Atmiya;

class Animal {
    void eat() {
        System.out.println("Base class");
    }
}
class Dog extends Animal {
    void display() {
        System.out.println("Child class");
    }
}
public class P13_2 {
    static void main(String[] args) {
        Dog myDog = new Dog() ;
        myDog.eat();
        myDog.display();
    }
}
