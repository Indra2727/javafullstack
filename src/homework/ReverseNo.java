package homework;

public class ReverseNo {
    public static void main(String[] args){
        int no=512;
        int rem=0;
        int rev=0;

        while (no>0){
            rem=no%10;
            no=no/10;
            rev=rev*10+rem;
        }
        System.out.print("Result :"+rev);
    }
}
