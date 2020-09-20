package javajichu.mode9;

public class Dem {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setAges(20);
        hero.setName("盖伦");

        hero.setSkill(new SkillImpl());

        hero.attack();


    }
}
