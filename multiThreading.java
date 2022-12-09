package javapracs;
public class multiThreading {
    public static void main(String[] args) {
        thread1 obj1 = new thread1();
        thread2 obj2 = new thread2();
        Thread t1 =  new Thread(obj1);
        Thread t2 =  new Thread(obj2);
        t1.start();
        t2.start();
    }
}

class thread1 implements Runnable{
    public void run(){
        while(true){
            System.out.println("THREAD 1 HAHHAHAHAHAHAHAH");
        }
    }
}

class thread2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("NOOOOOOOOO");
        }
    }
}