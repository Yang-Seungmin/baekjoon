import java.util.Scanner;
import java.util.regex.Pattern;

public class q1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < testCase; i++) {
            String str = scanner.nextLine();
            if(Pattern.matches("(100+1+|01)+", str)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
