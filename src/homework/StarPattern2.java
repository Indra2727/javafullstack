/*
    *
    * *
    * * *
    * * * *
    * * * * *
*/
package homework;

public class StarPattern2 {
    public static void main(String[] args){
        int i;
        int j;

        for(i=0;i<6;i++){
            for (j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }
}
