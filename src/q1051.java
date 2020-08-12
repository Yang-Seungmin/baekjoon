import java.util.Scanner;

public class q1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), M = scanner.nextInt();
        int[][] palette = new int[N][M];
        scanner.nextLine();

        int minLen = Math.min(N, M);

        for (int n = 0; n < N; n++) {
            String s = scanner.nextLine();
            for (int m = 0; m < M; m++) {
                palette[n][m] = s.charAt(m);
            }
        }

        for (int i = minLen; i >= 1; i--) {
            for (int n = 0; n <= N - minLen; n++)
                for (int m = 0; m <= M - minLen; m++) {
                    if (palette[n][m] == palette[n + minLen - 1][m] &&
                            palette[n][m] == palette[n][m + minLen - 1] &&
                            palette[n][m] == palette[n + minLen - 1][m + minLen - 1]) {
                        System.out.println(minLen * minLen);
                        return;
                    }
                }
        }

        System.out.println(1);
    }
}
