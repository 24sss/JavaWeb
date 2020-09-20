package javajichu.mode7neibulei.chongming;

public class My {
    int num =10;
    public class You{
        int num = 20;
        public void meth(){
            int num =30;
            System.out.println(num); //30
            System.out.println(this.num);//20
            System.out.println(My.this.num);//10
        }

    }
}
