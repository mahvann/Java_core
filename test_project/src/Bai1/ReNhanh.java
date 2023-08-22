package Bai1;

public class ReNhanh {
    public static void main(String[] args) {
        int a = 100,b = 200;
        if (a > b){
            System.out.println("a lon hon b");
        }
        else if(a == b){
            System.out.println("a bang b");
        }
        else{
            System.out.println("a nho hon b");
        }
        int month = 2;
        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.println("Thang co 31 ngay");
                break;
            case 2:
                System.out.println("Thang so 28 ngay");
                break;
            case 4,6,9,11:
                System.out.println("Thang co 30 ngay");
                break;
        }
    }
}
