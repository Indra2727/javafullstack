package staticKeyword;

public class Student {
    int rno;
    String name;
    static String schoolName;

    void display(){
        System.out.println("Roll Number:"+rno);
        System.out.println("Roll Number:"+name);
        System.out.println("Roll Number:"+schoolName);
        System.out.println("***********************");
    }
}
class StudentImpl{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.rno=1;
        s1.name="ABC";
        s1.schoolName="YM";

        Student s2=new Student();
        s2.rno=2;
        s2.name="Soma";
        s2.schoolName="YM";

        Student s3=new Student();
        s3.rno=3;
        s3.name="XYZ";
        s3.schoolName="IMED";

        s1.display();
        s2.display();
        s3.display();
    }
}
