package Bai2;

public class VongLap {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0;i < n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0;i < n; i++){
            if(i>5) break;
            System.out.print(i + " ");
        }
        System.out.println();
        while(n>=0){
            System.out.print(n + " ");
            n--;
        }
    }


}
