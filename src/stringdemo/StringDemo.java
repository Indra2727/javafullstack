package stringdemo;
/*
 * == operator : check whether strings having same memory address
 * equals() : checks contents of object
* */
public class StringDemo {
    public static void main(String[] args) {
        // by using literal
        String str1="Pune";
        String str3="Pune";

        //by using new Keyword
        String str2=new String("Pune");
        String str4=new String("Pune");

        if (str1 == str2) //check whether string having same memory address
        {
            System.out.println("Both strings are Equal");
        }
        else {
            System.out.println("Different String");
        }

        if (str1.equals(str2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
