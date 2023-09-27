/*public class extrairVariavel {
    public static void main(String args[]) {
        double b = 5;
        double c = 7;
        double d = 0;

        if (b * c < 8) {
            d = (b * c) + (b / c);
        }

        b = b * c;

        System.out.println("B:" + b + "\n" + "D:" + d);
    }
}
*/
public class extrairVariavel {
    public static void main(String args[]) {
        double b = 5, c = 7, d = 0, calculo = 0;
        calculo = b * c;

        if (calculo < 8) {
            d = calculo + (b / c);
        }

        b = calculo;

        System.out.println("B:" + b + "\n" + "D:" + d);
    }
}
