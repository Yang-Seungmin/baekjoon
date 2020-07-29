import java.util.Scanner;

public class q1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] opt = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    opt[j] = arr[j] - arr[i];
                    arr[j] = arr[i];
                }
            }
        }

        /*for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println();*/

        for (int a : opt) {
            System.out.print(a + " ");
        }
    }
}
