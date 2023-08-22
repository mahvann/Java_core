package Bai8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SXArrayList {
    public static void main(String[] args) {
        int []a = {1,5,2,4,2,7,1};
        List<Integer> arr = new ArrayList<>();
        for (int x: a){
            arr.add(x);
        }
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        arr.forEach((n) -> System.out.print((n) + " "));
    }
}
