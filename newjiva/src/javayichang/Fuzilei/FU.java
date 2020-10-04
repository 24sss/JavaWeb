package javayichang.Fuzilei;

public class FU {
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04(){}
}
class Zi extends FU{
    //子类重写父类异常时，抛出和父类相同的异常
    public void show01() throws NullPointerException,ClassCastException{}
    //子类重写父类方法时，抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    //子类重写父类异常时，不抛出异常
    public void show03(){}
    //父类没有抛出异常，子类重写父类该方法时也不能抛出
    //如果子类产生异常，只能捕获，不能抛出
    public void show04(){
        try{
            throw new Exception("编译期异常");
        }catch(Exception e){
            e.printStackTrace();;
        }
    }
}
