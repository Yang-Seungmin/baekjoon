import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class q1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>(size), B = new ArrayList<>(size);

        for(int i = 0; i < size; i++) A.add(scanner.nextInt());
        for(int i = 0; i < size; i++) B.add(scanner.nextInt());

        Collections.sort(A);
        Collections.sort(B);

        int result = 0;
        for(int i = 0; i < size; i++) result += A.get(size - 1 - i) * B.get(i);

        System.out.println(result);
    }
}
