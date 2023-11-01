import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int sum=1;
        for (int i = 0; i <n; i++) {
            if (i % 3==0 || i % 5==0) {
                sum++;

            }
            System.out.println(i);
        }

    }
}






