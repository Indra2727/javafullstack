package homework;
import  java.util.Scanner;
public class ArmstrongNo {
    public static void main(String[] args) {
        int no;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number:");
        no=scanner.nextInt();
        int no1=no;
        int power=0;

        while(no1!=0){
            no1=no1/10;
            power=power+1;
        }
        int no2=no;
        int rem;
        int arm=0;
        while (no2!=0){
            rem=no2%10;
            int multi=1;
            for (int i=1;i<=power;i++){
                multi=multi*rem;
            }
            arm=arm+multi;
            no2=no2/10;
        }
        if (no==arm)
            System.out.println(no+" is Armstrong Number");
        else
            System.out.println(no+" is Not Armstrong Number");
    }

}
