package exceptionHandling.keywords;
//NumberFormat Exception
public class TryCatch2 {
    public static void main(String[] args) {
        String a="123a";
        try{
            int i=Integer.parseInt(a);
            System.out.println(a);
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
