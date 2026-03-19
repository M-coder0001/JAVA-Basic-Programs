package com.Atmiya;

class myk {
     void display(String a, int b) {
        System.out.println("Name = " + a);
        System.out.println("Roll no. = " + b);
    }
}
class profession extends myk {
    void show () {
        System.out.println("I am a developer");
    }
}
public class P13_1 {
    static void main(String[] args) {
        profession a1 = new profession();
        a1.display("mayank",20);
        a1.show();
    }
}
