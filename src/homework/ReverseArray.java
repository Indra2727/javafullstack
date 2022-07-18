package homework;

public class ReverseArray {
    public static void main(String[] args) {
        int []a1=new int[]{3,16};
        System.out.println("Original Array Element: ");
        for (int i=0;i<a1.length;i++){
            System.out.print(a1[i]+ " ");
        }
        System.out.println();
        System.out.println("Reverse Array Element: ");
        for (int i=a1.length-1;i>=0;i--){
            System.out.print(a1[i]+ " ");
        }
    }
}
