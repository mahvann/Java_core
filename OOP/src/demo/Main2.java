package demo;

public class Main2 {
    public static void main(String[] args) {
        Student st = new Student("123","Manh Van",2003,"Hanoi");
        //st.setCode("2154654");
        System.out.println(st.toString());
        Student s1 = new Student();
        s1.input();
        System.out.println(s1);
    }
}
