package controlflowstatement;
import java.util.Scanner;
public class CalDoWhile {
    public static void main(String[] args){
        int no1,no2;
        Scanner scanner= new Scanner(System.in);
        char ch;
        int result;
        do{
            System.out.println("Enter no1");
            no1 =scanner.nextInt();
            System.out.println("Enter no2");
            no2 =scanner.nextInt();
            System.out.println("1.Add");
            System.out.println("2.Sub");
            System.out.println("3.Multi");
            System.out.println("4.Div");
            System.out.println("5.Modulo");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice){
                case 1: result=no1+no2;
                    System.out.println("Add is"+result);
                    break;
                case 2: result=no1-no2;
                    System.out.println("Sub is"+result);
                    break;
                case 3: result=no1*no2;
                    System.out.println("Multi is"+result);
                    break;
                case 4: result=no1/no2;
                    System.out.println("Div is"+result);
                    break;
                case 5: result=no1%no2;
                    System.out.println("Modulo is"+result);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Do You want to continue?");
            ch =scanner.next().charAt(0);
        }while (ch=='Y'||ch=='y');
    }
}
