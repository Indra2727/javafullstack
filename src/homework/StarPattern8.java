package homework;

public class StarPattern8 {
    public static void main(String[] args){
        int i;
        int j;

        for(i=1;i<7;i++){
            for (j=1;j<i;j++){
                if (i>2&&j<i-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
