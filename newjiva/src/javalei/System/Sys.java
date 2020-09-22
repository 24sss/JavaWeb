package javalei.System;


import java.util.Arrays;

public class Sys {
    public static void main(String[] args) {

        mod1(); //用来测试程序的效率
        mod2(); //将数组中指定数据拷贝到另一个数组中
    }
    private static void mod2(){
        int [] list={1,2,3,4,5};
        int [] dest={6,7,8,9,10};
        System.out.println("list 复制前"+ Arrays.toString(list));
        System.out.println("dest 复制前"+ Arrays.toString(dest));
        System.arraycopy(list,0,dest,0,3);
        System.out.println("list 复制后"+ Arrays.toString(list));
        System.out.println("dest 复制后"+ Arrays.toString(dest));


    }

    private static void mod1() {
        long s1=System.currentTimeMillis();

        for(int i=0;i<1000;i++){
            System.out.println(i);
        }

        long s2=System.currentTimeMillis();

        System.out.println("耗时"+(s2-s1));

    }
}
