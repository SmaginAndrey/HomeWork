import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        double maxNumber = Double.MIN_VALUE;
        double minNumber = Double.MAX_VALUE;
        double averageNumber = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите последовательность произвольных рациональных чисел: ");
        try {

            while (true) {
                double num = Double.parseDouble(scanner1.nextLine());
                sum += num;
                count++;
                maxNumber = Math.max(num, maxNumber);
                minNumber = Math.min(num, minNumber);
                averageNumber = sum / count;
                System.out.println("Сумма " + sum);
                System.out.println("Количество " + count);
                System.out.println("Максимальное значение " + maxNumber);
                System.out.println("Минимальное значение " + minNumber);
                System.out.println("Среднее значение " + averageNumber);
            }
        } catch (NumberFormatException e){

        }
    }
}
