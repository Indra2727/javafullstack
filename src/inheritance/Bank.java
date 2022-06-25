package inheritance;
//Single Inheritance
public class Bank {
    int bankNo;
    String ifscCode;
}
class SbiBank extends Bank{
    String address;
    String branchCode;
    String contactNo;
    void display(){
        System.out.println("bankNo :"+bankNo);
        System.out.println("address :"+address);
        System.out.println("branchCode :"+branchCode);
        System.out.println("contactNo :"+contactNo);
        System.out.println("ifscCode"+ifscCode);
    }
}
class BankImpl{
    public static void main(String[] args){
        SbiBank sbiBank=new SbiBank();
        sbiBank.bankNo=001;
        sbiBank.address="Pune";
        sbiBank.branchCode="SBI001";
        sbiBank.contactNo="9876543210";
        sbiBank.ifscCode="SBI123000";
        sbiBank.display();
    }
}
