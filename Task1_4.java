import java.util.Random;
import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        int max = 1;
        int numberSign;
        int count = 0;
        int prevSignNumber = 1;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите случайное число:");
        int n = scanner.nextInt();
        for (int i = 0; i<=n; i++) {
            int numbers = random.nextInt(2000) - 1000;
            numberSign = Integer.signum(numbers);
            if (numberSign == prevSignNumber) {
                count++;
            } else if (count > max) {
                max = count;
                count = 1;
            }
            prevSignNumber =numberSign;
        }
        System.out.println("Самая длиная серия: " + max);
    }
}
