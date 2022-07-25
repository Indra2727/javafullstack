package arrays;

import java.util.Scanner;

public class MultiMatrix {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element");

        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter Second Matrix: ");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("Addition of Two Matrix is: ");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                c[i][j] =0;
                for (int k=0;k<c.length;k++) {
                    c[i][j]  += a[i][k] * b[k][j];
                }
                System.out.print(" " + c[i][j]);
            }
            System.out.println();
        }

    }
}
