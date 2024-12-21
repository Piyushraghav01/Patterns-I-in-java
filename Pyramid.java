
import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
        //     // ith row
        //     //print spaces n - 1
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
        //     //print stars 2*i - 1/
            for (int j = 1; j <= 2 * 1 - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(' ');
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
