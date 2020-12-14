package JavaIO.JavaIO1.shujuliu;

import java.io.*;

//练习-向文件中写入两个数字，然后把这两个数字分别读取出来
//第一种方式： 使用缓存流把两个数字以字符串的形式写到文件里，再用缓存流以字符串的形式读取出来，然后转换为两个数字。
//注： 两个数字之间要有分隔符用于区分这两个数字。 比如数字是31和15，如果不使用分隔符，那么就是3115，读取出来就无法识别到底是哪两个数字。 使用分隔符31@15能解决这个问题。
//第二种方式： 使用数据流DataOutputStream向文件连续写入两个数字，然后用DataInpuStream连续读取两个数字
public class ex1 {
    static File f = new File("d:\\LOLFOLDER\\test6.txt");
    static int x =31;
    static int y = 15;
    public static void main(String[] args) {
        //缓存流的方式
        method1();
        //数据流的方式
        method2();
    }

    private static void method2(){
        try(
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                )
        {
            dos.writeInt(x);
            dos.writeInt(y);

            int x = dis.readInt();
            int y = dis.readInt();
            System.out.printf("使用数据流读取出的x是 %d y是 %d%n",x,y);


        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void method1(){
        try(
                FileWriter fw = new FileWriter(f);
                PrintWriter pw = new PrintWriter(fw);
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                )
        {
            pw.println(x+"@"+y);
            pw.flush();

            String str = br.readLine();
            String[]ss = str.split("@");
            int x = Integer.parseInt(ss[0]);
            int y = Integer.parseInt(ss[1]);
            System.out.printf("使用缓存流读取出的x是 %d y是 %d%n",x,y);



        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
