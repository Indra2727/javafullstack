package homework;

public class StarPattern4 {
    public static void main(String[] args){
        int i;
        int j;
        int k;
        for(i=0;i<6;i++){
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
