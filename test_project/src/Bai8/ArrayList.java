package Bai8;

import java.util.List;

public class ArrayList {
    public static void HienThi(List<Integer> arr){
        for (int i=0;i< arr.size();i++){
            System.out.print(arr.get(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //ArrayList chỉ lưu được các object, không thể lưu được các kiểu
        //dữ liệu nguyên thủy như int, long, float, double... Thay vì đó ta sử dụng
        //lớp wrapper của kiểu dữ liệu đó là Integer, Long, Float, Double...
        List<Integer> arr = new java.util.ArrayList<>();
        for (int i = 0;i<10;i++){
            arr.add(i);
        }
        HienThi(arr);

        //Hàm clear(): Xóa toàn bộ các phần tử trong array list.
        //Hàm isEmpty(): Kiểm tra array list rỗng.

        //Kiểm tra sự tồn tại của một giá trị trong array list trả về true, false
        System.out.println(arr.contains(9));
        System.out.println(arr.contains(20));

        //Hàm remove(index): Xóa 1 phần tử khỏi chỉ số index.
        arr.remove(1);
        HienThi(arr);

        //Hàm toArray():Trả về mảng chứa các object tương tự như trong array list.
        Object[] b = arr.toArray();
        for(Object x : b)
            System.out.print(x + " ");
        System.out.println();
        //Hàm indexOf():Trả về chỉ số đầu tiên của 1 phần tử nếu nó xuất hiện trong array list, trả về -1 nếu phần tử này không xuất hiện.
        System.out.println(arr.indexOf(2));

        //Hàm forEach():Cung cấp một áp dụng hàm nào đó với lần lượt các phần tử trong array list.
        arr.forEach((n) -> System.out.print(n + " "));
    }
}
