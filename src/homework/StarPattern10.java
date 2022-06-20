package homework;

public class StarPattern10 {
    public static void main(String[] args){
        int a;
        int b;
        int c=5;
        int d;

        for (a=1;a<=c;a++){
            for (b=1;b<=(c-a);b++){
                System.out.print(" ");
            }
            for (d=1;d<=2*a-1;d++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
