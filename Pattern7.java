
import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int p = i;
            int j = 1;
            while (j <= i) {
                System.out.print(p);
                p = p + 1;
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}

