package javajichu.Red;

import java.util.ArrayList;

public class NamalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalmoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalmoney/totalCount;

        int mod = totalmoney%totalCount;

        for(int i=0;i<totalCount-1;i++){
            list.add(avg);
        }

        list.add(avg+mod);

        return list;
    }
}
