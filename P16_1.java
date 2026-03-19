package com.Atmiya;

class Animal1 {
    void sound() {
        System.out.println("Animal");
    }
}
class Dog1 extends Animal1 {
    void sound() {
        System.out.println("Dog");
    }
}
class Cat1 extends Animal1 {
    void sound() {
        System.out.println("Cat");
    }
}
public class P16_1 {
    static void main(String[] args) {
        Animal1 obj;

        obj = new Dog1();
        obj.sound();
        obj = new Cat1();
        obj.sound();
    }

}
