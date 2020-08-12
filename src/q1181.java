import java.util.*;

public class q1181 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < size; i++) {
            stringSet.add(scanner.nextLine());
        }

        ArrayList<String> arrayList = new ArrayList<>();

        for(String s : stringSet) {
            arrayList.add(s);
        }

        arrayList.sort((o1, o2) -> {
            if (o1.length() - o2.length() == 0) return o1.compareTo(o2);
            else return o1.length() - o2.length();
        });

        for(String s : arrayList) {
            System.out.println(s);
        }
    }
}
