package javajihe.Map.Ofen;

import java.util.HashMap;
import java.util.Scanner;

public class Lianxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();

        //2。创建集合
        HashMap<Character,Integer> map = new HashMap<>();

        //3.遍历，判断
        for(char c :str.toCharArray()){
            if(map.containsKey(c)){
                int value=map.get(c);
                value++;
                map.put(c,value);
            }
            else{
                map.put(c,1);
            }
        }

        //4.
        for(char key :map.keySet()){
            Integer value =map.get(key);
            System.out.println(""+key+""+value);
        }



    }
}
