package arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6,2,3,1,8,9,1};

        System.out.println("Duplicates Elements is ");
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    System.out.print(a[j]+ " ");
                    break;}
            }
        }
    }
}
