import java.util.Scanner;

public class q1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int siteW, siteE;

        for(int t = 0; t < testCase; t++) {
            siteW = scanner.nextInt();
            siteE = scanner.nextInt();

            System.out.println(combination(siteE, siteW));
        }
    }

    public static int combination(int n, int r) {
        if(n == r || r == 0) return 1;
        return combination(n - 1, r - 1) + combination(n - 1, r);
    }
}
