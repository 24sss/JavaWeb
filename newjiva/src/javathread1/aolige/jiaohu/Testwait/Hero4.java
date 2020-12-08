package javathread1.aolige.jiaohu.Testwait;

public class Hero4 {
    public String name;
    public float hp;
    public int damage;

    public synchronized void rec(){
        hp++;
        System.out.printf("%s回血1点，%s的血量为%.0f%n",name,name,hp);
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

        }

        public void attact(Hero4 h){
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
        if(h.isDead())
            System.out.println(h.name+"死了");
    }
    public boolean isDead(){
        return 0>=hp?true:false;
    }
}
