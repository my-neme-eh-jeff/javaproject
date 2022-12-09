package javapracs;
public class multiThreadingUsingThread {
    public static void main(String[] args) {
        Thread obj1 = new Thread1();
        Thread obj2 = new Thread2();
        obj1.start();
        obj2.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("nooooooooo");
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("nooooooooo");
        }
    }
}