package javathread.Demo01;

public class Thread {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        my.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }

    }
}
