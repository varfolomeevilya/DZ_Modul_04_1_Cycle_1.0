public class Task08 {
    public static void main(String[] args) {
        for (int j = 0; j <= 23; j++) {
            int min = j % 10 * 10 + (j / 10) % 10;
            if (min <= 59) {
             System.out.println(j + ":" + min);
            }
        }
    }
}

