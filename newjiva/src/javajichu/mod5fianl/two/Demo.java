package javajichu.mod5fianl.two;

public class Demo {
    public static void main(String[] args) {
        int num1=10;
        num1=20;
        System.out.println(num1);

        final int num2=20;
        /*num2=30;  错误，用final定义后，不能改变值*/

        //正确，只要赋值一次就可以
        final int num3;
        num3=30;

        //对于基本类型来说，不可变的的是变量当中的数据值
        //对于引用类型来说，不可改变的是变量当中的地制值

    Student stu = new Student("赵丽颖");
    System.out.println(stu);//打印的地址，一
         System.out.println(stu.getName());
    stu = new Student("霍建华");
    System.out.println(stu);//打印的地址，与一不同
        System.out.println(stu.getName());


    final Student stu1 = new Student("高圆圆");
    /*stu1=new Student("高圆圆圆圆");  错误，地址不能改变*/

        stu1.setName("高圆圆圆圆");//虽然地址不能改变，但是里面的值可以改变
    System.out.println(stu1.getName());
    }
}
