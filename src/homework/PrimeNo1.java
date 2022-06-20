
package homework;

public class PrimeNo1 {
    public static void main(String[] args) {
        int no = 15;
        boolean flag = false;

        for (int i = 2; i < no / 2; i++) {
            if (no % i == 0) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("No. is Prime");
        } else {
            System.out.println("No. is not Prime");
        }
    }

}

