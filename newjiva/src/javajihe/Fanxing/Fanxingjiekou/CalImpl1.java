package javajihe.Fanxing.Fanxingjiekou;
/*含有泛型的接口的第二种使用方法：接口使用什么泛型，实现类就使用什么泛型,类跟着接口走
就相当于定义了一个含有泛型的类，创建对象的时候确定泛型的类型
public interface List<E>{
     boolean add(E e);
     E get(int index);
     }
  public class ArrayList<E> implement List<E>{
     public boolean add (E e){}
     public E get(int index){}
     }


*/
public class CalImpl1<I> implements Cal<I> {
    @Override
    public void meth(I i) {
        System.out.println(i);
    }
}
