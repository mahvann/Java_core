package Bai11;

import java.util.HashSet;

public class HashSett {
    public static void HienThi(HashSet set){
        for (Object x:set){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /*
        Java cung cấp 3 lớp:HashSet, LinkedHashSet, TreeSet

         */
        HashSet<Integer> set = new HashSet<>();
        /*
        • HashSet chỉ lưu được các phần tử khác nhau.
        • HashSet được cài đặt bằng bảng băm, vì thế tốc độ tìm kiếm phần tử đạt được là O(1).
        • HashSet không có thứ tự, tức là các phần tử trong HashSet có thể xuất hiện nhiều thứ tự bất kì.
        • HashSet chỉ lưu được các phần tử kiểu đối tượng.

        Hàm Chức năng
            add() Thêm phần tử vào set
            remove() Xóa phần tử khỏi set
            size() Trả về số lượng phần tử trong set
            contains() Kiểm tra sự tồn tại của 1 phần tử trong set
            clear() Xóa mọi phần tử trong set
            isEmpty() Trả về true nếu set rỗng, ngược lại trả về false
         */
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(5);
        HienThi(set);

        set.remove(1);
        HienThi(set);




    }
}
