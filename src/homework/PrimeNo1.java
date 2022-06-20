
package homework;

public class PrimeNo1 {
    public static void main(String[] args) {
        int no = 17;
        boolean flag = false;

        for (int i = 2; i < no / 2; i++) {
            if (no % i == 0) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        System.out.println(flag? "No. is Prime" : "No. is not prime");
    }

}

