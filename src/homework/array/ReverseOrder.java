package homework.array;
//Java Program to print the elements of an array in reverse order
public class ReverseOrder {
    public static void main(String[] args) {
        int [] arr = new int [] {7,2,9,4,1};
        System.out.println("Original array: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        for (int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
