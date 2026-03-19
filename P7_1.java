package com.Atmiya;

class  std {
    String name ;
    int age;
    void display() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

}
public class P7_1 {
    static void main(String[] args) {
        std s1 = new std();
        s1.name = "Riya";
        s1.age = 20;
        s1.display();

        System.out.println();

        int n = 50;
        Integer w = n;
        System.out.println("n = " + n);
        System.out.println("w = " + w);
    }
}
