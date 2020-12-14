package JavaIO.JavaIO1.duixiangliu;

import javathread1.aolige.two.Hero;

import java.io.*;
//序列化一个对象顶折
//创建一个Hero对象，设置其名称为garen。
//把该对象序列化到一个文件garen.lol。
//然后再通过序列化把该文件转换为一个Hero对象
public class test {
    public static void main(String[] args) {
        Horo h = new Horo();
        h.name = "garren";
        h.hp = 616;

        //准备一个文件用于保存该对象
        File f = new File("d:\\LOLFOLDER\\ga.lol");
        try(
                //对象输出流
                FileOutputStream fos =new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                //创建对象输ru流
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                )
        {
            oos.writeObject(h);

            Horo h2 = (Horo)ois.readObject();
            System.out.println(h2.name);
            System.out.println(h2.hp);

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
