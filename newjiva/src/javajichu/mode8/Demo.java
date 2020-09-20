package javajichu.mode8;

public class Demo {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setAges(20);
        hero.setName("盖伦");

        Wpen wen = new Wpen("AK—47");
        hero.setWpen(wen);

        hero.attak();


    }
}
