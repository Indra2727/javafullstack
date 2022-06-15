package controlflowstatement;

import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        number = sc.nextInt();

        if (number<0){
            number = -number;
        }
        System.out.println("Absolute value "+number);
    }
}
