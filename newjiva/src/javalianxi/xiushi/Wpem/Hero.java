package javalianxi.xiushi.Wpem;

public class Hero {
    private String name;
    private int age;
    private Wpen wpen;

    public  void attack(){
        System.out.println(""+age+"岁的"+name+"用"+wpen.getName()+"攻击对方");

    }

    public Hero() {
    }

    public Hero(String name, int age, Wpen wpen) {
        this.name = name;
        this.age = age;
        this.wpen = wpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Wpen getWpen() {
        return wpen;
    }

    public void setWpen(Wpen wpen) {
        this.wpen = wpen;
    }
}
