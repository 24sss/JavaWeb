package javayichang.Throw;

public class Objects {
    public static void main(String[] args) {
        s(null);

    }
    public static void s(Object obj){
        if(obj==null){
            throw new NullPointerException("空指针");
        }

    //    Objects.requireNonNull(obj);
    }

}
