import javax.swing.*;
import java.util.Scanner;

public class q1032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[N];
        for(int n = 0; n < N; n++) {
            strings[n] = scanner.nextLine();
        }

        boolean[] notSames = new boolean[strings[0].length()];
        for(int i = 0; i < strings[0].length(); i++) {
            char before = strings[0].charAt(i);
            for(int j = 1; j < N; j++) {
                if(before != strings[j].charAt(i)) {
                    notSames[i] = true;
                    break;
                } before = strings[j].charAt(i);
            }
        }

        for(int i = 0; i < strings[0].length(); i++) {
            System.out.print(notSames[i] ? '?' : strings[0].charAt(i));
        }

    }

}
