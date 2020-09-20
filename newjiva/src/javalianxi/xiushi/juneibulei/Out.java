package javalianxi.xiushi.juneibulei;

public class Out {
    int num =10;
    public void meth(){
        int num =20;
        class IN{
            public void In(){
                System.out.println(num);
            }
        }
        IN in = new IN();
        in.In();
    }
}
