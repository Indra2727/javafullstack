package homework;
import java.util.Scanner;
public class Ass2 {
    public static void main(String[] args) {
        //Largest and smallest number taking user input
        int a ;
        int b ;
        int c ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        a = sc.nextInt();
        System.out.println("Enter the Second Number");
        b = sc.nextInt();
        System.out.println("Enter the Third Number");
        c = sc.nextInt();

        // Largest Number
        if (a > b && a > c)
            System.out.println(a + "  is Largest Number");
        else if (b > a && b > c)
            System.out.println(b + "  is largest number");
        else
            System.out.println(c + "  is largest number");

        //Smallest Number
        if (a < b && a < c)
            System.out.println(a + "  is Smallest Number");
        else if (b < a && b < c)
            System.out.println(a + "  is Smallest Number");
        else
            System.out.println(a + "  is Smallest Number");
    }
}
