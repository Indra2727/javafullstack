package homework.array;

public class LargeSmallElement {
    public static void main(String[] args) {
        int [] arr = new int [] {87, 1, 71, 75, 99};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Largest element is: " + max);
        System.out.println("Smallest element is: "+min);
    }
}
