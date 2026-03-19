package com.Atmiya;

class a {
    void showa() {
        System.out.println("class A");
    }
}
class b extends a {
    void showb() {
        System.out.println("class b");
    }
}
class c extends b {
    void showc() {
        System.out.println("class c inherit b");
    }
}
class d extends b {
    void showd() {
        System.out.println("class d inherit b");
    }
}
public class P14_2 {
    static void main(String[] args) {
        c c1 = new c();
        c1.showa();
        c1.showb();
        c1.showc();

        d d1 = new d();
        d1.showa();
        d1.showb();
        d1.showd();

    }
}
