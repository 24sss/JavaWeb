package javalei.Object.equals;
import  java.util.Objects;
public class Objs {
    public static void main(String[] args) {
            String a = "abc";
            String b = null;
          //boolean c = b.equals(a); //NullPointerException  空指针异常
            boolean d = Objects.equals(a,b);
            System.out.println(d);//false

        }


}
