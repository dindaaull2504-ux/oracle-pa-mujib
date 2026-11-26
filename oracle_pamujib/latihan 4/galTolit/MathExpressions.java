
public class MathExpressions {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 2.0;
        double z = 5.0;

        double a = Math.sqrt(Math.pow(x, 5) - 6) / 4;
        System.out.println("Hasil a = " + a);

        double b = Math.pow(x, y) - Math.pow(6, x);
        System.out.println("Hasil b = " + b);

        double c = 4 * Math.cos(z / 5.0) - Math.sin(Math.pow(x, 2));
        System.out.println("Hasil c = " + c);

        double d = Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(y, 3));
        System.out.println("Hasil d = " + d);

        double e = 1.0 / (y - (1.0 / (x - Math.pow(2, y))));
        System.out.println("Hasil e = " + e);

        double f = 7 * Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 * x - 4))));
        System.out.println("Hasil f = " + f);
    }
}