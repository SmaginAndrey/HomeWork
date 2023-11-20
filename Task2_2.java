import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        long minutes =getMinutes(args);
        if (minutes<=0){
            System.out.println("Уже началось!");
        }else {
            long day = minutes/1440;
            long hour = (minutes - 1440*(minutes/1440))/60;
            long minute = ((minutes - 1440 * day) - hour*60);
            System.out.println(day + " день" + " " + hour + " часов" + " " + minute + " минут");
        }

    }
    private static long getMinutes(String[] args) {
        if (args.length == 1) {
            return Long.parseLong(args[0]);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число минут: ");
            return scanner.nextLong();
        }
    }
}
