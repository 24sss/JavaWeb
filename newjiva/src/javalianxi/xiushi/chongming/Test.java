package javalianxi.xiushi.chongming;

public class Test {
    int num=10;
    public class IN{
        int num = 20;
        public void meth(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Test.this.num);
        }

    }
}
