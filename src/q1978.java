import java.util.Scanner;

public class q1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int primes = 0;
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if(nums[i] == 1) continue;
            if(nums[i] <= 3) {
                primes++;
                continue;
            }
            boolean isPrime = true;
            for(int j = 2; j < nums[i]; j++) {
                if(nums[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) primes++;
        }

        System.out.println(primes);
    }
}
