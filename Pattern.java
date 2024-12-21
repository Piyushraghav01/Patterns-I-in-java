
import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        /*for (int i = 1; i < n; i++) {
            // I am at ith row
            for (int j = 1; j <= n; j++) {
                // ith row and ith column
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();*/

        //p2
        for (int i = 1; i <= n; i++) {
        // I am at ith row
            for (int j = 1; j <= n; j++) {
        // ith row and ith column
                System.out.print(j);
            }
             System.out.println();
        }
       // I am done printing ith row
        System.out.println();
        System.out.println();

        //p3
        for (int i = 1; i <= n; i++) {
        // I am at ith row
            for (int j = 1; j <= n; j++) {
        // ith row and ith column
                System.out.print(n - j + 1);
            }
        // I am done printing ith row
            System.out.println();
        }

    }
}
