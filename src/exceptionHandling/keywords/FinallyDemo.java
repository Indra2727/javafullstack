package exceptionHandling.keywords;

public class FinallyDemo {
    public static void main(String[] args) {
        String msg=null;
        try{
            System.out.println(10/0);
            System.out.println(msg.toLowerCase());
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("In Finally Code");
        }
        System.out.println("Rest of the code");
    }
}
