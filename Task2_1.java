import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость товара с учётом НДС");
        double cost = scanner.nextDouble();
        double nds = (cost*20)/120;
        double itemPriceWithoutNds = cost - nds;
        double ndsReceipt = (cost - itemPriceWithoutNds);
        double ndsTaxReturn = Math.rint(ndsReceipt);
        System.out.printf("Стоимость товара без НДС: %.2f %n",itemPriceWithoutNds);
        System.out.printf("Сумма НДС в чеке: %.2f %n",ndsReceipt);
        System.out.printf("Сумма НДС для налоговой декларации: %.2f %n",ndsTaxReturn);
    }
}
