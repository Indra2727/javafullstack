package homework.array;

import java.util.Scanner;

public class ThirdSmallestNo {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner scanner=new Scanner(System.in);
        int temp=0;
        int size=a.length;

        System.out.println("Elements of original array: ");
        for (int i =0; i < size; i++) {
            a[i]=scanner.nextInt();
        }

        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if (a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        System.out.println("Third Largest Number is: "+a[size-3]);
    }
}
