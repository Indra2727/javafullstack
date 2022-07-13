package homework;
import java.util.Scanner;
public class Div3And5 {
    public static void main(String[] args) {
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        no= sc.nextInt();

        if (no%3==0 && no%5==0){
            System.out.println(no+" is Divisible by 3 & 5");
        }
        else if (no%3==0) {
            System.out.println(no+" is Divisible by 3");
        }
        else if (no%5==0) {
            System.out.println(no+" is Divisible by 5");
        }
        else {
            System.out.println(no+" is not Divisible by 3 & 5 ");
        }
    }
}
