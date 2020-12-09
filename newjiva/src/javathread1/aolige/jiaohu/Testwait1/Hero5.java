package javathread1.aolige.jiaohu.Testwait1;

public class Hero5 {
    public String name;
    public int damage;
    public float hp;

    public synchronized void rec(){
        ////当血量大于或者等于1000的时候
        // this.wait() 让占用这个对象的线程等待，并临时释放锁
        if(hp>=1000){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        hp++;
        System.out.printf("%s 回血1点,增加血后，%s的血量是%.0f%n", name, name, hp);
        this.notify();
    }

    public synchronized void hurt(){
        if(hp==1){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        hp--;
        System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);
        //掉血之后，唤醒等待的线程
        this.notify();

    }
    public void attack(Hero5 h){
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
        if(h.isDead()){
            System.out.println(h.name+"死了");

        }

    }
    public boolean isDead(){
        return 0>=hp?true:false;
    }


}
