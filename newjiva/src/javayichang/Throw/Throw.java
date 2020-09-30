package javayichang.Throw;

public class Throw {
    public static void main(String[] args) {
        int [] a = null;
        int aa = nul(a,0);
        System.out.println(aa);
    }

    public static int nul(int[] a,int m){
        if(a==null){
            throw new NullPointerException("空指针异常");
        }
        else if(m<0||m>2){
            throw new ArrayIndexOutOfBoundsException("超出索引");
        }
        return a[m];
    }

}
