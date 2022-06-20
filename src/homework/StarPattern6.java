package homework;

public class StarPattern6 {
    public static void main(String[] args){
        int i;
        int j;

        for(i=0;i<7;i++){
            for (j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        for(i=5;i>0;i--){
            for (j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
