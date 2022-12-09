package javapracs;

public class tableUsingThreads {
    public static void main(String[] args) {
        Thread obj1 = new five();
        Thread obj2 = new six();
        obj1.start();
        obj2.start();
    }
}

class five extends Thread {
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 11; i++) {
            System.out.println("5* " + i + " = " + i * 5);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken for execution of thread 5 is"+(end-start));
    }
}

class six extends Thread {
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 11; i++) {
            System.out.println("6* " + i + " = " + i * 6);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken for execution of thread 6 is"+(end-start));
    }
}
