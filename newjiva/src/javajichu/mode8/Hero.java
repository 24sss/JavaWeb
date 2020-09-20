package javajichu.mode8;

public class Hero {
    private String name;
    private int ages;
    private Wpen wpen;

    public void attak(){
        System.out.println(""+ages+"岁的"+name+"正在用"+wpen.getName()+"攻击对方");
    }

    public Hero(){

    }
    public Hero(String name, int ages, Wpen wpen) {
        this.name = name;
        this.ages = ages;
        this.wpen = wpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public Wpen getWpen() {
        return wpen;
    }

    public void setWpen(Wpen wpen) {
        this.wpen = wpen;
    }
}
