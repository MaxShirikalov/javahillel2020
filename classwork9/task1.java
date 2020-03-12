package classwork9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        list11();
        list22();

    }

    public static void list11(){
        List<Integer> list1 = new LinkedList<>();
        for(int i = 0; i < 1000000; i++){
            list1.add(i);
        }
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            list1.add(list1.size()/2, i);
        }
        long finish = System.currentTimeMillis();

        System.out.println("LL size -> " + (finish - start));

    }

    public static void list22(){
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < 1000000; i++){
            list2.add(i);
        }
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            list2.add(list2.size()/2, i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("AL size -> " + (finish - start));
    }



}
