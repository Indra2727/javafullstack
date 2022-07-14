package finalKeyword;
//Final variable
public class Person {
    int id;
    String name;
    final String PAN_NO="ABCD1234EF";
    final String AADHAR_NO;
    final String MOBILE_NO;
    static final  String BIRTH_DATE;
    Person(String aadhar_no,String mobile_no){
        AADHAR_NO=aadhar_no;
        MOBILE_NO=mobile_no;
        System.out.println("Aadhar No:"+AADHAR_NO);
        System.out.println("Mobile No:"+MOBILE_NO);
    }
    static {
        BIRTH_DATE="01/01/0001";
    }
}
class PersonImpl{
    public static void main(String[] args) {
        Person person=new Person("123456789009","9087654321");
    }
}
