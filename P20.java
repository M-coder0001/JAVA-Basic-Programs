package com.Atmiya;

class P20 implements  Runnable{
    public void run() {
        System.out.println("Thread is running");
    }

    static void main(String[] args) {
        P20 t1 = new P20();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}
