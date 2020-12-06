package javathread1.aolige.fangfa;

public class Sleep {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                int seconds=0;
                while(true){
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("已经晚了%d秒%n",seconds++);
                }
            }
        };
        t1.start();
    }
}
