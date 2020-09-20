package javajichu.mode7neibulei.niming;

public class Demo {
    public static void main(String[] args) {
        MyinterfaceImpl Impl = new MyinterfaceImpl();
        Impl.meth();

        System.out.println("======================");


        Myinterface niming = new Myinterface() {
            @Override
            public void meth() {
                System.out.println("使用匿名内部类");
            }
        };
        niming.meth();
    }
}
