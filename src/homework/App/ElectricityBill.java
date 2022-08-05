package homework.App;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Unit:");
        int unit= sc.nextInt();
        double bill=0;
        if (unit>0 && unit<=50){
            bill=unit*0.50;
        }
        else if (unit<=150) {
            bill=50*0.50+(unit-50)*0.75;
        }
        else if (unit<=250) {
            bill=50*0.50+100*0.75+(unit-150)*1.20;
        }
        else {
            bill=50*0.50+100*0.75+100*1.20+(unit-250)*1.50;
        }
        double total=bill+((20*bill)/100);;

        System.out.println("Total Bill: "+total);
    }
}
