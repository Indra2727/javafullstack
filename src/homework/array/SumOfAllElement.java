package homework.array;
//Java Program to print the sum of all the items of the array
import java.util.Scanner;

public class SumOfAllElement {
    public static void main(String[] args) {
        int a[]=new int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements");

        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Sum of All Elements: "+sum);
    }
}
