package javalianxi.xiushi.jiekou;

public class Demo {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setAges(20);
        hero.setName("贝利亚");
        hero.setSkll(new SkillImpl());
        hero.attack();

    }
}
