package JavaIO.JavaIO1.duixiangliu;

import java.io.*;

public class test1 {
    public static void main(String[] args) {
        //创建Hero数组
        Horo hs[] =new Horo[10];
        for (int i = 0; i < hs.length; i++) {
           // hs[i] = new Horo("hero:" +i);
        }
        File f =new File("d:/heros.lol");

        try(
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos =new ObjectOutputStream(fos);
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois =new ObjectInputStream(fis);
        ) {
            //把数组序列化到文件heros.lol
            oos.writeObject(hs);
            Horo[] hs2 = (Horo[]) ois.readObject();
            System.out.println("查看中文件中反序列化出来的数组中的每一个元素：");
            for (Horo hero : hs2) {
                System.out.println(hero.name);
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

