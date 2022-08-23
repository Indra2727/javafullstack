package stringdemo;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter name");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();

        String nameArray[]=name.split(" ");
        System.out.println(nameArray.length);
//        for (String s:nameArray){
//            System.out.println(s);
//        }
        char firstInitial=nameArray[0].toUpperCase().charAt(0);
        char middleInitial=nameArray[1].toUpperCase().charAt(0);

       // System.out.println(nameArray[2].substring(0,1).toUpperCase());
        String lastname=nameArray[2].substring(0,1).toUpperCase().concat(nameArray[2].substring(1));
        String initialName=firstInitial+"."+middleInitial+"."+lastname;
        System.out.println(initialName);


    }
}
