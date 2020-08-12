import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q1005_old {
    static boolean[][] graph; //[From][To]
    static int[] buildTime;
    static int N, K, W;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int t = 0; t < testCase; t++) {
            N = scanner.nextInt();
            K = scanner.nextInt();

            graph = new boolean[N + 1][N + 1];
            buildTime = new int[N + 1];

            for (int i = 1; i <= N; i++) buildTime[i] = scanner.nextInt();
            for (int i = 0; i < K; i++)
                graph[scanner.nextInt()][scanner.nextInt()] = true;

            W = scanner.nextInt();

        }
    }

    public static int getCost(int endPoint) {
        int cost = buildTime[endPoint];
        int max = 0;
        for (int i = 0; i <= N; i++) {
            if (graph[i][endPoint]) {
                int nextCost = getCost(i);
                if (max < nextCost) max = nextCost;
            }
        }
        return cost + max;
    }
}
