import java.util.Scanner;

public class q1105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = String.valueOf(scanner.nextInt());
        String r = String.valueOf(scanner.nextInt());
        int count = 0;

        if (l.length() == r.length()) {
            for (int i = 0; i < l.length(); i++) {
                if (l.charAt(i) == '8' && r.charAt(i) == '8') {
                    count++;
                } else break;
            }
        }

        System.out.println(count);

    }
}
