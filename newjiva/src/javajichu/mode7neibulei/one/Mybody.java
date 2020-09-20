package javajichu.mode7neibulei.one;

public class Mybody {       //外部类

    //内部类
    public class Myheart{
        //内部成员方法
        public void heart(){
            System.out.println("心脏跳动");
            System.out.println("我叫:"+name);  //内部随意调用外部方法
        }
    }

    //外部类的成员变量
    private  String name;
    //外部成员方法
    public void  Body(){
        Myheart hear = new Myheart();         //外部类方法中 new一个内部类对象
        hear.heart();                         //通过内部类对象访问内部类成员方法
        System.out.println("外部成员方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
