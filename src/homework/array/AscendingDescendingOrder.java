package homework.array;
//Java Program to sort the elements of an array in ascending and descending order
import java.util.Scanner;

public class AscendingDescendingOrder {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [5] ;
        Scanner scanner=new Scanner(System.in);
        int i;
        int temp = 0;

        System.out.println("Elements of original array: ");
        for ( i =0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }

        for ( i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order is");
        for (i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        for ( i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Descending Order is");
        for (i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
