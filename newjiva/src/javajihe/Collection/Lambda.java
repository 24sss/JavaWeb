package javajihe.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lambda {
    public static void main(String[] args) {
        Collection books = new ArrayList();
        books.add("疯狂Java讲义");
        books.add("jsp&Servlet");
        books.add("深入java虚拟机");
        books.forEach(book->System.out.println("书："+book));

    }
}
