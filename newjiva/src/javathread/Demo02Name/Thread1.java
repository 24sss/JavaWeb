package javathread.Demo02Name;

public class Thread1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        new MyThread().start();
        new MyThread().start();
        //Thread-1 Thread-2 Thread-0

    }
}


