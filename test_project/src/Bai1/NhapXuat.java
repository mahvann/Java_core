package Bai1;

import java.util.Scanner;

public class NhapXuat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("So vua nhap la: "+a);

        System.out.print("Nhap mot so nguyen: ");
        long b = sc.nextLong();

        System.out.print("Nhap mot so thuc: ");
        double c = sc.nextDouble();

        sc.nextLine();
        System.out.print("Nhap mot ki tu: ");
        char d = sc.nextLine().charAt(0);
        System.out.println("Ki tu vua nhap: "+d);
    }
}
