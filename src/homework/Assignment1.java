package homework;

public class Assignment1 {
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        int c = 10;

        // Largest Number
        if (a > b && a > c)
            System.out.println(a + "  is Largest Number");
        else if (b > a && b > c)
            System.out.println(b + "  is Largest Number");
        else
            System.out.println(c + "  is Largest Number");

        //Smallest Number
        if (a < b && a < c)
            System.out.println(a + "  is Smallest Number");
        else if (b < a && b < c)
            System.out.println(a + "  is Smallest Number");
        else
            System.out.println(a + "  is Smallest Number");
    }
}
