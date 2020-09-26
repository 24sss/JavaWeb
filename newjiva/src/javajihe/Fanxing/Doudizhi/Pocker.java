package javajihe.Fanxing.Doudizhi;

import java.util.ArrayList;
import java.util.Collections;

public class Pocker {
    public static void main(String[] args) {
        //1.准备牌
        ArrayList <String> pock = new ArrayList<>();
        String[] clos = {"红桃","黑桃","梅花","方片"};
        String[] nums = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        pock.add("大王");
        pock.add("小王");
        for(String col:clos){
            for(String num:nums){
                pock.add(col+num);
            }
        }

        //2.洗牌
        Collections.shuffle(pock);

        //3.发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for(int i =0;i<pock.size();i++){
            String p = pock.get(i);
            if(i>=51){
                dipai.add(p);
            }
            else if(i%3==0){
                player1.add(p);
            }
            else if(i%3==1){
                player2.add(p);
            }
            else if(i%3==2){
                player3.add(p);
            }
        }

        //4.查看牌
        System.out.println("刘德华："+player1);
        System.out.println("周润发："+player2);
        System.out.println("周星驰："+player3);
        System.out.println("底牌："+dipai);

    }
}
