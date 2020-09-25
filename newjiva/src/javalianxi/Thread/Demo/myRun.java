package javalianxi.Thread.Demo;

public class myRun implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<10;i++){
            System.out.println("t1正在运行");
        }
    }
}
