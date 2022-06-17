package homework;
import java.util.Scanner;
public class PrimeNo {
    public static void main(String args[]){
        int i;
        int j=0;
        int num;//it is the number to be checked
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        num = sc.nextInt();

        for(i=1;i<num;i++){
            if(num%i==0){
                j++;
            }
        }
        if(j==1){
            System.out.println(num+" is Prime Number");
        }
        else {
            System.out.println(num+" is not Prime Number");
        }
    }
}
