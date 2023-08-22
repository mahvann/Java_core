package Bai11;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSett {
    public static void HienThi(LinkedHashSet set){
        for (Object x:set){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /*
        • LinkedHashSet chỉ lưu được các phần tử khác nhau.
        • LinkedHashSet được cài đặt bằng bảng băm và danh sách liên kết, vì thế tốc độ tìm kiếm phần tử đạt được là O(1) .
        • LinkedHashSet có thứ tự là thứ tự bạn thêm các phần tử vào set.
        • LinkedHashSet chỉ lưu được các phần tử kiểu đối tượng.
         */

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        HienThi(set);


    }
}
