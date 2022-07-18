package homework;

public class AddNoArray {
    public static void main(String[] args) {
        int []a1=new int[2];
        int sum=0;
        a1[0]=10;
        a1[1]=20;

        for (int i =0;i< a1.length;i++)
        {
            sum=sum+a1[i];
        }
        System.out.println(sum+ " ");
    }
}
