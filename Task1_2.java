import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольное значение:");
        if (scanner.hasNextInt()) {
            int integerNumber = scanner.nextInt();
            System.out.println("Вы ввели целое число: " + integerNumber);
        } else if (scanner.hasNextDouble()) {
            double rationalNumber = scanner.nextDouble();
            System.out.println("Вы ввели рациональное число: " + rationalNumber);
        } else if (scanner.hasNextBoolean()) {
            boolean booleanValue = scanner.nextBoolean();
            System.out.println("Вы ввели логическое значение: " + booleanValue);
        } else {
            String string = scanner.nextLine();
            System.out.println("Вы ввели текст: " + string);
        }
    }
}
