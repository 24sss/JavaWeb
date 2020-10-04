package javayichang.trycatch;

public class finanlly {
    public static void main(String[] args) {
        int num =get();
        System.out.println(num);//100

    }
    public static int get(){
        try{
            int a=10;
        }catch(Exception e){
            System.out.println(e.toString());
        }finally {
            int a = 100;
            return a;
        }


    }
}
