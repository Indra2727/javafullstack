package homework;

public class StarPattern13 {
    public static void main(String[] args) {
        int i;
        int k;
        int j;

        for (i=1;i<6;i++) {
            for (k=6;k>i;k--) {
                System.out.print(" ");
            }
            for (j=1;j<(i*2);j++) {
                if (j>1 && j<(i*2)-1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (i=4;i>0;i--) {
            for (j=6;j>i;j--) {
                System.out.print(" ");
            }
            for (k=1;k<(i*2);k++) {
                if (k>1 && k<(i*2)-1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

