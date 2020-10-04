package javathread.Demo04sleep;

public class Main {
    public static void main(String[] args) {
        for(int i=0 ;i<20 ;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
