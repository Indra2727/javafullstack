package homework;

public class StarPattern7 {
    public static void main(String[] args){
        int i;
        int j;
        int k;
        for(i=0;i<7;i++){
            for (k=6;k>i;k--){
                System.out.print(" ");
            }
            for (j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=5;i>0;i--){
            for (k=6;k>i;k--){
                System.out.print(" ");
            }
            for (j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
