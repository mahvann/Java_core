package Bai5;

import java.util.Scanner;

public class MangMotchieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Hàm 100 phần tử
        int n = 2;
        int [] a = new int[n];
        for (int i = 0;i<n;i++){
            System.out.print("Nhap a[" + i +"] = ");
            a[i] = sc.nextInt();
        }
        for (int i = 0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int [] b = {1,2,3,4};
        for (int i= 0; i<4; i++){
            System.out.print(b[i]+" ");
        }

    }
}
