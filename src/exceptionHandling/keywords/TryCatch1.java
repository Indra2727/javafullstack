package exceptionHandling.keywords;
//Array Index Example
public class TryCatch1 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        try{
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[3]);
            System.out.println(a[5]);
            System.out.println(a[2]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
