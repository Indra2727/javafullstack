package homework;
import java.util.Scanner;
public class EvenOddNo {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if(num%2 == 0){
            System.out.println(num + " is even Number");
        }
        else{
            System.out.println(num + " is odd Number");
        }
    }
}
