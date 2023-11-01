import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            if (i % 10 == 0) {
                System.out.print(i);
            }
        }
    }
}
