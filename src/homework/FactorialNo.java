package homework;
import java.util.Scanner;
public class FactorialNo {
    public static void main(String[] args) {
        int fact = 1;
        int i = 1;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = sc.nextInt();


        while( i <= num ){
            fact = fact * i;
            i++; //increment i by 1
        }

        System.out.println("\nFactorial of " + num + " is: " + fact);
    }
}
