package Bai4;

public class Ham {
    public static int DienTich(int a,int b){
        return a * b;
    }
    public static void Chao(){
        System.out.println("Hello cac ban!!!");
    }
    public static void main(String[] args) {
        Chao();
        int a = 10, b = 5;
        System.out.println("Dien tich la: " + DienTich(a,b));
    }
}
