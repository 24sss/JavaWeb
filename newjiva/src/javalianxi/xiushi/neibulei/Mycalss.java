package javalianxi.xiushi.neibulei;

public class Mycalss {
    public class Innter{
        public void meyh(){
            System.out.println("内部类");
        }
        public void IN(){
            System.out.println("名字:"+name);
        }
    }
    private String name;

    public void OUT(){
        Innter innter = new Innter();
        innter.meyh();
        innter.IN();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
