package homework;

public class PowerInWhileLoop {
    public static void main(String[] args){
        int no = 2;
        int power = 3;
        int result = 1;
        while(power>0){
            result = result*no;
            power --;
        }
        System.out.println("Answer="+result);
    }
}
