package javathread1.aolige.Tongbu.Test1;
//2.同时：
// synchronized (this) {
//            hp=hp-1;
//        }

// public synchronized void recover(){
//        hp=hp+1;
//    }
///回血
//    //直接在方法前加上修饰符synchronized
//    //其所对应的同步对象，就是this
//    //和hurt方法达到的效果一样
//在测试函数中不用做任何工作，即不用加任何synchronized

public class Hero2 {
    public String name;
    public float hp;
    public int damage;

    public void rec(){
        hp++;
    }
    public void hurt() {
        synchronized (this) {
            hp--;
        }
    }

    public void attack(Hero2 h){
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead())
           System.out.println(h.name+"死了");

    }
    public boolean isDead(){
        return 0>=hp?true:false;
    }


}
