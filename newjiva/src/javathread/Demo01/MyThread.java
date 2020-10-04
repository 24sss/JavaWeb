package javathread.Demo01;

public class MyThread extends java.lang.Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run"+i);
        }
    }
}
