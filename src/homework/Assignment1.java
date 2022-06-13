package homework;

public class Assignment1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Largest Number
        if (a > b && a > c)
            System.out.println(a + "  is Largest Number");
        else if (b > a && b > c)
            System.out.println(b + "  is largest number");
        else
            System.out.println(c + "  is largest number");

        //Smallest Number
        if (a < b && a < c)
            System.out.println(a + "  is Smallest Number");
        else if (b < a && b < c)
            System.out.println(a + "  is Smallest Number");
        else
            System.out.println(a + "  is Smallest Number");
    }
}
