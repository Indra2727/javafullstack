package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a1; //initialisation
        a1 =new int[10]; //instantiation
        a1[0]=10;
        a1[1]=20;
        a1[2]=30;
        a1[3]=40;
        a1[4]=50;
        System.out.println(a1[2]); //Random access
        for (int i =0;i<10;i++)
        {
            System.out.print(a1[i]+ " ");
        }
        for(int i:a1) {
            System.out.print(i+" ");
        }
    }
}
