package exceptionHandling.keywords;
//Throw Keyword
import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        try {
            validateage(age);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void validateage(int age) {
        if (age < 18 || age > 55) {
            throw new ArithmeticException("You are not eligible");
        } else {
            System.out.println("You are eligible");
        }
    }

}

