import java.util.Scanner;

public class q1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] opt = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        while(count < size) {
            int min = Integer.MAX_VALUE;
            int minIdx = 0;
            for (int i = 0; i < size; i++) {
                if(arr[i] != -1 && min > arr[i]) {
                    min = arr[i];
                    minIdx = i;
                }
            }
            arr[minIdx] = -1;
            opt[minIdx] = count++;
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
