package javajichu.mode7neibulei.jubuneibulei;

public class Out { //外部类
    int num =10;
    public void Outer(){ //外部方法
        class In{        //局部内部类
            int num=20;
            public void Iner(){ //局部成员方法
                System.out.println(num);

            }
        }
        In inner = new In();
        inner.Iner();
    }
}
