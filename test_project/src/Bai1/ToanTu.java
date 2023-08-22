package Bai1;

public class ToanTu {
    public static void main(String[] args) {

        //Neu chia 2 so nguyen thi ket qua se lay phan nguyen
        //Neu muon lay ca phan thap phan thi nhan 1.0
        int a = 1544521,b = 4545;
        System.out.println("Ket qua cua phep chia: "+ 1.0*a/b);

        //Nếu nhân 2 số nguyên kiểu int với nhau thì kết quả có thể bị tràn vì vậy phải ép kiểu 1 trong 2 số sang long
        System.out.println("Ket qua cua phep nhan: "+ (long)a*b);
        if (b++ > 4545){
            System.out.println("Cong sau");
        }
        if (++b > 4545){
            System.out.println("Cong truoc");
        }
    }
}
