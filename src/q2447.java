import java.util.Scanner;

public class q2447 {
    static char[][] palette;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        palette = new char[size][size];

        draw(size, 0, 0);

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) System.out.print(palette[i][j]);
            System.out.println();
        }

    }

    public static void draw(int size, int offsetX, int offsetY) {
        if (size == 3) {
            for (int i = offsetX; i < offsetX + size; i++)
                for (int j = offsetY; j < offsetY + size; j++) {
                    if (!(i == offsetX + 1 && j == offsetY + 1)) palette[i][j] = '*';
                }
        } else {
            draw(size / 3, offsetX, offsetY);
            draw(size / 3, offsetX + size / 3, offsetY);
            draw(size / 3, offsetX + size / 3 * 2, offsetY);

            draw(size / 3, offsetX, offsetY + size / 3);
            draw(size / 3, offsetX + size / 3 * 2, offsetY + size / 3);

            draw(size / 3, offsetX, offsetY + size / 3 * 2);
            draw(size / 3, offsetX + size / 3, offsetY + size / 3 * 2);
            draw(size / 3, offsetX + size / 3 * 2, offsetY + size / 3 * 2);
        }
    }
}
