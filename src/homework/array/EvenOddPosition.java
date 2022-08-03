package homework.array;

public class EvenOddPosition {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5};

        System.out.println("Elements of given array present on even position: ");
        for (int i = 1; i < arr.length; i = i+2) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Elements of given array present on Odd position: ");
        for (int j=0;j<arr.length;j=j+2){
            System.out.print(arr[j]+ " ");
        }
    }
}
