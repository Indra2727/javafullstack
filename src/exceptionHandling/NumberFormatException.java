package exceptionHandling;
//Number Format Exception
public class NumberFormatException {
    public static void main(String[] args) {
        String n="101A";
        int i=Integer.parseInt(n);
        System.out.println(i+5);
    }
}
