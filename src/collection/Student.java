package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Student {
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String contactNumber;

    public Student(Integer id, String firstName, String middleName, String lastName, String contactNumber) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("Student Details\n");
        builder.append("Id: "+id+"\n");
        builder.append("Full Name: "+firstName+" "+middleName+" "+lastName+"/n");
        builder.append("Contact Number: "+contactNumber+"\n");
        return builder.toString();
    }
}
class StudentImpl{


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        StudentImpl studentImpl = new StudentImpl();
        int ch;
        do{
            System.out.println("1.Insert");
            System.out.println("2.Update Record");
            System.out.println("3.Delete Record");
            System.out.println("4.Display");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    Student s = studentImpl.insertStudentData(sc);
                    students.add(s);
                    break;
                case 2:
                    if (students.isEmpty())
                        System.out.println("List is empty");
                    else {
                        studentImpl.updateRecord(sc,students);
                    }
                    break;
                case 3:
                    if (students.isEmpty())
                        System.out.println("List is empty");
                    else {
                        studentImpl.deleteRecord(sc,students);
                    }

                case 4:
                    System.out.println("-----------------------------------------------");
                    studentImpl.display(students);
                    System.out.println("-----------------------------------------------");
            }
        }while (true);
    }

    private void display(List<Student> students){
        Iterator iterator = students.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    private void updateRecord(Scanner sc,List<Student> students){
        System.out.println("Enter student id to update record");
        Integer id = sc.nextInt();
        int choice;
        do {
            System.out.println("1.Update fname: ");
            System.out.println("2.Update mname: ");
            System.out.println("3.Update lname: ");
            System.out.println("4.Update contact No.: ");
            System.out.println("Enter Choice to Update: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter contact number to update record for id "+id);
                    String fname = sc.next();
                    for(Student s:students){
                        if (s.getId() == id){
                            s.setFirstName(fname);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter contact number to update record for id "+id);
                    String mname = sc.next();
                    for(Student s:students){
                        if (s.getId() == id){
                            s.setMiddleName(mname);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter contact number to update record for id "+id);
                    String lname = sc.next();
                    for(Student s:students){
                        if (s.getId() == id){
                            s.setLastName(lname);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter contact number to update record for id "+id);
                    String mbl = sc.next();
                    for(Student s:students){
                        if (s.getId() == id){
                            s.setContactNumber(mbl);
                        }
                    }
            }
        }while (choice !=0);
    }

    private  void deleteRecord(Scanner sc,List<Student> students){
        System.out.println("Enter Student id to Delete Record");
        Integer id=sc.nextInt();
        Iterator<Student> iterator=students.iterator();
        while (iterator.hasNext()){
            Student s=iterator.next();
            if (s.getId() == id){
                iterator.remove();
            }
        }
        }
    private Student insertStudentData(Scanner sc) {
        System.out.print("Enter student id: ");
        Integer id = sc.nextInt();
        System.out.print("Enter first name: ");
        String fName = sc.next();
        System.out.print("Enter middle name: ");
        String mName = sc.next();
        System.out.print("Enter last name: ");
        String lName = sc.next();
        System.out.print("Enter Contact Number: ");
        String mbl = sc.next();
        System.out.println("------------------------------------------");
        Student student = new Student(id,fName,mName,lName,mbl);
        return student;
    }
}
