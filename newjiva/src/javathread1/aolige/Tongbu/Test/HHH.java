package javathread1.aolige.Tongbu.Test;

public class HHH {
    public String name;
    public float hp;
    public int damage;

    public void upd(){
        hp++;
    }
    public void dow(){
        hp--;
    }

    public void attack(HHH h){
        hp-=damage;
        //System.out.println("%s正在攻击%s,%s的血量变成%f",name,h.name,h.name,h.hp);
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead())
            System.out.println(h.name+"sl");
    }
    public boolean isDead(){
        return 0>hp?true:false;
    }

}
