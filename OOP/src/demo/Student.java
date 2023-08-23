package demo;

import java.util.Scanner;

public class Student {
    //4 Thuoc tinh
    private String code;
    private String name;
    private int birthYear;
    private String address;
    //ham tao
    public Student(){

    }
    public Student(String code, String name, int birthDay,String address){
        this.code = code;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return code + " " +name + " " + birthYear+ " " +address+ "\n";
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("code: ");
        code = sc.nextLine();
        System.out.print("name: ");
        name = sc.nextLine();
        System.out.print("Birth Year: ");
        birthYear = sc.nextInt();
        sc.nextLine();
        System.out.print("address");
        address = sc.nextLine();

    }
    public void output(){

    }
}
