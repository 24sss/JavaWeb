package javajichu.mode7neibulei.nimin;

public class Demo {
    public static void main(String[] args) {
        Myinterface obj = new Myinterface() { //这是匿名内部类，不是匿名对象，obj是对象，没有匿名
            @Override
            public void meth() {
                System.out.println("匿名内部类覆盖重写aaa");
            }
            public void meth1(){
                System.out.println("匿名内部类覆盖重写AAA");
            }
        };
        obj.meth();
        obj.meth1();


        System.out.println("=======================");

        //使用匿名内部类，同时使用匿名对象
        new Myinterface(){
            public void meth(){
                System.out.println("使用匿名内部类覆盖重写，并且使用匿名对象");
            }
            public void meth1(){
                System.out.println("使用匿名内部类，同时使用匿名对象");
            }

        }.meth();//使用匿名内部类，只能调用接口中的唯一一个方法；




    }
}
