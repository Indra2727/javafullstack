package interfaceDemo;

public interface Bank {
    double getRateOfInterest();
    float N=10;
}
interface BankOperations extends Bank{
    double calculateInterest();

}
class HDFC implements BankOperations{
    @Override
    public double getRateOfInterest() {
        return 10;
    }

    @Override
    public double calculateInterest() {
        return 10;
    }
}
class BankImpl{
    public static void main(String[] args) {
        BankOperations bank=new HDFC();
        System.out.println(bank.getRateOfInterest());
        System.out.println(bank.calculateInterest());
    }
}

