package javalianxi.xiushi.Wpem;

public class Demo {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setAge(20);
        hero.setName("爱丽丝");

        Wpen wpen = new Wpen();
        wpen.setName("AK-47");

        hero.setWpen(wpen);
        hero.attack();
    }
}
