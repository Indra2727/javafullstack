package exceptionHandling.keywords;
//Arithmetic and NullPointer Exception
public class TryCatch {
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=0;
        String msg=null;
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println(a/b);
            System.out.println("5");
            System.out.println(msg.toUpperCase());
            System.out.println("6");
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (NullPointerException ne){
            //System.out.println(msg.toUpperCase());
            msg="Ddddfd";
            System.out.println(msg.toUpperCase());
        }
        System.out.println("7");
    }
}
