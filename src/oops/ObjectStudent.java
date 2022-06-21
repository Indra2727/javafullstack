package oops;

import java.util.Scanner;

public class ObjectStudent {
    int rno;
    String name;
    String address;
    float age;

    void insertData(int r,String nm,String add,float a){
        rno=r;
        name=nm;
        address=add;
        age=a;
    }
    void dispaly(){
        System.out.println("******* Student Details *******");
        System.out.println("Roll no. "+rno);
        System.out.println("Name "+name);
        System.out.println("Address "+address);
        System.out.println("Age "+age);
    }
}
class ObjectStudentImpl{
    public static void main(String[] args){
        ObjectStudent s1 = new ObjectStudent();
        s1.rno=1;
        s1.name="Jitu";
        s1.address="Pune";
        s1.age= 22.5f;
        System.out.println(+s1.rno+ " "+s1.name+" "+s1.address+" "+s1.age);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rno");
        int rno=sc.nextInt();
        System.out.println("Enter Name");
        String nm=sc.next();
        System.out.println("Enter Address");
        String addr=sc.next();
        System.out.println("Enter Age");
        float age=sc.nextFloat();
        ObjectStudent s2 =new ObjectStudent();
        s2.insertData(rno,nm,addr,age);
        s2.dispaly();

        ObjectStudent s3=new ObjectStudent();
        s3.insertData(2,"Indra","Mumbai",32);
        s3.dispaly();
    }
}