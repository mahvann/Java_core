package Bai5;

import java.util.Scanner;


public class MangLamThamSo {
    public static void NhanDoi(int a[], int n){
        for (int i = 0;i<n;i++){
            a[i] *=2;
        }
    }
    public static void HienThi(int a[], int n){
        for (int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
    }
    public static  void SapXep(int a[], int n){
        for (int i = 0;i<n-1;i++){
            for (int j = i+1;j<n;j++){
                if(a[i]>a[j]){
                    int tg= a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Hàm 100 phần tử
        int n = 2;
        int [] a = new int[n];
        for (int i = 0;i<n;i++){
            System.out.print("Nhap a[" + i +"] = ");
            a[i] = sc.nextInt();
        }
        NhanDoi(a,n);

        HienThi(a,n);
    }
}
