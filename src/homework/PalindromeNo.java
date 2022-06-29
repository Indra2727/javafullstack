package homework;
import java.util.Scanner;
public class PalindromeNo {
    public static void main(String[] args){
        int no;
        int rem;
        int rev=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        no=scanner.nextInt();
        int temp=no;

        while (temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if (no==rev){
            System.out.println(no+" is Palindrome Number");
        }
        else{
            System.out.println(no+" is not Palindrome Number");
        }
    }
}
