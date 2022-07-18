package arrays;

import java.util.Scanner;
//Addition of 3 matrix in multidimensional array
public class Add3Matrix {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int d[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Matrix: ");

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
        System.out.println("Enter Third Matrix: ");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                c[i][j]= sc.nextInt();
            }
        }
        System.out.println("Addition of Two Matrix is: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                d[i][j]= a[i][j]+b[i][j]+c[i][j];
                System.out.print(" "+d[i][j]);
            }
            System.out.println();
        }
    }
}
