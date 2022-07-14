package staticKeyword;
//Static Method
public class Employee {
    int emp;
    String empName;
    static String companyName;
    static void show(){
        companyName="Codekul";
    }
    void display(){
        companyName="Codekul";
        System.out.println("Company Name"+companyName);
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee.show();
        Employee e1=new Employee();
        e1.display();
    }
}
