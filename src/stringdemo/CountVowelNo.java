package stringdemo;

import java.util.Scanner;

public class CountVowelNo {
    public static void main(String[] args) {

        int vCount = 0;
        int cCount = 0;
        int nCount = 0;

        Scanner sc =new Scanner(System.in);
        String str = sc.next();

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            }
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
            else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                nCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
        System.out.println("Numbers of Digits: "+nCount);
    }
}
