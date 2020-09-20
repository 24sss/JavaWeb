package javajichu.mode9;

public class Hero {
    private String name;
    private int ages;
    private Skill skill;


    public void attack(){
        System.out.println(""+name+"正在释放技能");
        skill.skill();
        System.out.println("释放技能完成");
    }
    public Hero() {
    }

    public Hero(String name, int ages, Skill skill) {
        this.name = name;
        this.ages = ages;
        this.skill = skill;
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

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
