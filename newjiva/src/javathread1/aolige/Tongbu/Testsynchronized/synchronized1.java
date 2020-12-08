package javathread1.aolige.Tongbu.Testsynchronized;

import java.text.SimpleDateFormat;
import java.util.Date;
///synchronized表示当前线程，独占 对象 someObject
//当前线程独占 了对象someObject，如果有其他线程试图占有对象someObject，就会等待，直到当前线程释放对someObject的占用。
//someObject 又叫同步对象，所有的对象，都可以作为同步对象
//为了达到同步的效果，必须使用同一个同步对象
public class synchronized1 {
    public static  String new0(){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }
    public static void main(String[] args) {
        final Object somObject = new Object();

        Thread t1= new Thread(){
            public void run(){
                try{
                    System.out.println(new0()+"----t1线程开始运行");
                    System.out.println(new0()+this.getName()+"----试图占有对象:someObject");

                    synchronized (somObject){
                        System.out.println(new0()+this.getName()+"----占有对象:some");

                        Thread.sleep(3000);
                        System.out.println(new0()+this.getName()+"----t1释放对象");

                    }
                    System.out.println(new0()+"----t1线程结束");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        t1.setName("t1");
        t1.start();


        Thread t2 = new Thread(){
            public void run(){
                try{
                    System.out.println(new0()+"----t2线程开始");
                    System.out.println(new0()+this.getName()+"----试图占有对象");
                    synchronized (somObject){
                        System.out.println(new0()+this.getName()+"---占有对象：someObject");
                        Thread.sleep(5000);
                        System.out.println(new0()+getName()+"---释放对象");
                    }
                    System.out.println(new0()+"----t2线程结束");

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        t2.setName("t2");
        t2.start();


    }
}
