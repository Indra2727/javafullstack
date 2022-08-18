package stringdemo;

public class StringMethods {
    public static void main(String[] args) {
        String str="Codekul";
        System.out.println("Upper Case: "+str.toUpperCase());
        System.out.println("Lower Case: "+str.toLowerCase());
        System.out.println("char At: "+str.charAt(3));
        System.out.println("concat: "+str.concat(" pvt. ltd."));
        System.out.println("replace: "+str.replace(str,"Mumbai"));
        System.out.println("replace All: "+str.replaceAll("Codekul","Mumbai"));
        System.out.println("Contains: "+str.contains("brings"));
        System.out.println(str);
    }
}
