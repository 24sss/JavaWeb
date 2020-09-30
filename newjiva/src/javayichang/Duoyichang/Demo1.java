package javayichang.Duoyichang;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        //1.多个异常，逐个处理
       /*try {
            int[] a = {1, 2, 3};
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());//Index 3 out of bounds for length 3
        }

       try{
           ArrayList<Integer> integers = new ArrayList<>();
           integers.add(1);
           System.out.println(integers.get(4));
        }catch(IndexOutOfBoundsException e){
           //e.printStackTrace();
           System.out.println(e.getMessage());//Index 4 out of bounds for length 1
       }

       System.out.println("后续代码");//后续代码
        */

        //2.多个异常，一次捕捉，多次处理
        //注意：如果存在子父类，那么子类必须在上面
        //ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
        /*try {
            int[] a = {1, 2, 3};
            System.out.println(a[3]);
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(1);
            System.out.println(integers.get(4));

       } catch (ArrayIndexOutOfBoundsException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());//Index 3 out of bounds for length 3
        }catch(IndexOutOfBoundsException h){
            //e.printStackTrace();
            System.out.println(h.getMessage());
        }

        System.out.println("后续代码");//后续代码

*/


        //一次捕获异常，一次处理异常
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[3]);
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(1);
            System.out.println(integers.get(4));

        } catch (ArrayIndexOutOfBoundsException e) {//父类，可以接收自己的对象，也可以接收子类对象。
            // e.printStackTrace();
            System.out.println(e.getMessage());//Index 3 out of bounds for length 3
        }
        System.out.println("后续代码");//后续代码

    }
}
