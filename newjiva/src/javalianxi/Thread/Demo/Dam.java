package javalianxi.Thread.Demo;

public class Dam {
    public static void main(String[] args) {
        myRun s1 = new myRun();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);

        t1.start();
        t2.start();

        for(int i=1;i<9;i++){
            System.out.println("main函数正在运行");
        }
    }
}
