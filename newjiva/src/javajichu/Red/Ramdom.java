package javajichu.Red;

import java.util.ArrayList;
import java.util.Random;

public class Ramdom implements OpenMode{
    @Override
    public ArrayList<Integer> divide(int totalmoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r= new Random();
        int leftMoney = totalmoney;
        int leftcount = totalCount;

        for(int i=0;i<totalCount-1;i++){
            int money=r.nextInt(leftMoney/leftcount*2)+1;
            list.add(money);
            leftMoney -=money;
            leftcount--;
        }
        return list;
    }
}
