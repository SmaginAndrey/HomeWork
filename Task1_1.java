public class Task1_1 {
    public static void main(String[] args) {
        double a = 30.0;
        double b = 10000.1;
        double c = 12.5;
        double d = 99.99;
        double e = 0.0;
        double f = -23.45;
        double g = -4.5;
        double h = -129.675;

        double resA = Math.rint(a);
        double resB = Math.ceil(b);
        double resC = Math.floor(c);
        double resD = Math.round(d);
        double resE = Math.rint(e);
        double resF = Math.ceil(f);
        double resG = Math.floor(g);
        double resH = Math.round(h);

        String format = "|%1$-20s|%2$-20s\n";
        System.out.format(format, a, resA);
        System.out.format(format, b, resB);
        System.out.format(format, c, resC);
        System.out.format(format, d, resD);
        System.out.format(format, e, resE);
        System.out.format(format, f, resF);
        System.out.format(format, g, resG);
        System.out.format(format, h, resH);
        System.out.println();
    }
}
