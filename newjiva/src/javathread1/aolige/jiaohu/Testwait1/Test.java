package javathread1.aolige.jiaohu.Testwait1;

public class Test {
    public static void main(String[] args) {
        Hero5 garren = new Hero5();
        garren.name="盖亚";
        garren.hp=616;

        Thread t1 = new Thread(){
            public void run(){
                while(true){
                   garren.hurt();
                    try {
                        //减慢掉血的速度
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                while(true){
                   garren.rec();
                    try {
                        //加快回血的速度
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        };
        t2.start();

    }

}
