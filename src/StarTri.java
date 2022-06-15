public class StarTri {
    public static void main(String[] args){
        int a;
        int b;
        int c;

        for (a=1;a<6;a++){
            for (b=6-a;b>1;b--){
                System.out.print(" ");
            }
            for (c=0;c<a;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
