package stringdemo;

public class StringComp {
    public static void main(String[] args) {
        String s1="pune";
        String s2="Mumbai";

        String s3=new String("Pune");

        if (s1==s2)
            System.out.println("True");
        else
            System.out.println("False");

        if (s1.equals(s2))
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println(s1.compareTo(s2));

        System.out.println(s1.equalsIgnoreCase(s3));



    }
}
