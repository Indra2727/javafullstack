package exceptionHandling;
//Try catch finally Test cases
public class A {
    public static void main(String[] args) {
        String n=null;
        try{
            System.out.println("I am in try");
            System.out.println(n.length());
        }catch (Exception e){
            System.out.println(e.getMessage());
            try{
                System.out.println(10/0);
            }catch (Exception e1){
                System.out.println(e1.getMessage());
            }
        }
        finally {
            String num="123A";
            try {
                System.out.println(Integer.parseInt(num));
            }
            catch (Exception e2){
                System.out.println("Given String contain Alphabets");
            }
        }
        System.out.println("Rest of the Code");
    }
}
