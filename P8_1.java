package com.Atmiya;

class student {
    int id;
    String name;

    student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
    }
}
public class P8_1 {
    static void main(String[] args) {
        student s1 = new student(1, "Vipul");
        student s2 = new student(2, "Riya");

        s1.display();
        s2.display();
    }
}
