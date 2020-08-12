import java.util.Scanner;

public class q1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, l;
        int[] arr = new int[101];

        n = scanner.nextInt();
        l = scanner.nextInt();

        if(n < getAddition(l) && l > 100) {
            System.out.println("-1");
            return;
        }

        for(int i = l; i <= 100; i++) {
            int div =  n / i+ (i % 2 == 0 ? 1 : 0);
            int sum = 0;
            boolean minus = false;
            for(int j = 0; j < i; j++) {
                arr[j] = div + j - i / 2 ;
                if(arr[j] < 0) {
                    minus = true;
                    break;
                }
                sum += arr[j];
            }
            if(minus) continue;

            //for(int j = 0; j < i; j++)
            //    System.out.print(arr[j] + " ");
            //System.out.println(sum);
            if(sum == n) {
                for(int j = 0; j < i; j++)
                    System.out.print(arr[j] + " ");
                System.out.println();
                return;
            }
        }

        System.out.println("-1");
    }

    public static int getAddition(int l) {
        int sum = 0;
        for (int i = 1; i <= l; i++) {
            sum += i;
        }
        return sum;
    }
}
