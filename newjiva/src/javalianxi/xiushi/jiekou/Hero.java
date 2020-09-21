package javalianxi.xiushi.jiekou;

public class Hero {
    private String name;
    private int ages;
    private Skll skll;

    public void attack(){
        System.out.println(""+ages+"岁的"+name+"正在释放技能");
        skll.skill();

    }
    public Hero() {
    }

    public Hero(String name, int ages, Skll skll) {
        this.name = name;
        this.ages = ages;
        this.skll = skll;
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

    public Skll getSkll() {
        return skll;
    }

    public void setSkll(Skll skll) {
        this.skll = skll;
    }
}
