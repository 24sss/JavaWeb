package javajichu.Red;

public class Demo {
    public static void main(String[] args) {

        MyRed red = new MyRed("传智播客");
        //群主
        red.setOwnerName("王思聪");

        //普通红包
  //       OpenMode namal = new NamalMode();
  //          red.setOpenMode(namal);

        //手气红包
        OpenMode random = new Ramdom();
        red.setOpenMode(random);
    }
}
