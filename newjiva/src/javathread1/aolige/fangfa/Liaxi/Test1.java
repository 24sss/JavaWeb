package javathread1.aolige.fangfa.Liaxi;

import javathread1.aolige.fangfa.youxainji.Test;
//英雄有可以放一个技能叫做: 波动拳-a du gen。
//每隔一秒钟，可以发一次，但是只能连续发3次。
//
//发完3次之后，需要充能5秒钟，充满，再继续发。
public class Test1 {
    public String name;
    public float hp;

    public Test1(){}
    public Test1(String name){
        this.name=name;
    }

    public int damage;

    public void attack(Test1 h){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);

        if(h.isDead()){
            System.out.println(h.name + "死了！");
        }

    }
    public boolean isDead(){
        return 0>=hp?true:false;
    }


    int total=3;
    public void adugen(){
        while(true){
            for(int i=0;i<total;i++){
                System.out.printf("波动拳第%d发%n", i + 1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("充能");
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Test1 h =new Test1();
        h.name="洪灾";

        h.adugen();
    }
}
