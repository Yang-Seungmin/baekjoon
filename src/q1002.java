import java.util.Scanner;

public class q1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, y1, r1, x2, y2, r2;
        int testCase = scanner.nextInt();

        for (int t = 0; t < testCase; t++) {
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            r1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            r2 = scanner.nextInt();

            double dis12 = getDistance(x1, y1, x2, y2);
            // System.out.println("distance between 1 and 2 : " + dis12);

            //반지름 위치 같을때
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println("-1");
                continue;
            }

            double rbigger = Math.max(r1, r2);
            double rsmaller = Math.min(r1, r2);

            //원 안에 중심
            if (dis12 < rbigger) {
                if (dis12 < rbigger - rsmaller) System.out.println("0");
                else if (dis12 + rsmaller == rbigger) System.out.println("1");
                else System.out.println("2");
                continue;
            }

            //원 밖에 다른 점
            if (dis12 > (double) r1 + r2) System.out.println("0");
            else if (dis12 == (double) (r1 + r2)) System.out.println("1");
            else System.out.println("2");
        }

    }

    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
