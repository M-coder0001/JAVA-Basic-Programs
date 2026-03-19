package com.Atmiya;

class vehical {
    final int speedLimit = 100;
    final void display() {
        System.out.println("Speed limit is: " + speedLimit);
    }
}
public class P8_3 {
    static void main(String[] args) {
        vehical v = new vehical();
        v.display();
//        v.speedLimit = 200;
    }
}
