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
            System.out.println("Это: ");
            Format.outputOptions(day,"день", "дня", "дней");
            Format.outputOptions(hour,"час", "часа", "часов");
            Format.outputOptions(minute,"минута", "минуты", "минут");
        }

    }
    class Format {
        static void outputOptions(long time, String oneFormat, String twoFormat, String threeFormat) {
            long t = time % 10;
            if (t == 1)
                System.out.println(time + " " + oneFormat);
            else if (t == 2 || t == 3 || t == 4)
                System.out.println(time + " " + twoFormat);
            t = time % 100;
            if (5 <= t && t <= 20)
                System.out.println(time + " " + threeFormat);
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
