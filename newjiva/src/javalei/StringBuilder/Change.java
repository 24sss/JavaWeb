package javalei.StringBuilder;

public class Change{
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("str:"+str);
        //String->StringBuilder;
        StringBuilder bui = new StringBuilder(str);
        //往StringBuilder中添加数据
        bui.append("world");
        System.out.println("bui:"+bui);

        //StringBuilder->String
        String s= bui.toString();
        System.out.println("s:"+s);

    }
}
