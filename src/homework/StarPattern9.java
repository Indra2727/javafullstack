package homework;

public class StarPattern9 {
    public static void main(String[] args){
        int i;
        int j;
        int k;

        for(i=1;i<=5;i++) {
            for (j=5;j>i;j--) {
                System.out.print(" ");
            }
            for (k=1;k<=i;k++) {
                if(i>=2&&k>1){
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
