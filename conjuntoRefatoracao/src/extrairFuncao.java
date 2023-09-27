/*public class extrairFuncao {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;

        int c = a + b;
        int d = a + c;

        System.out.println("C:" + c + "\nD:" + d);
    }
}
*/
public class extrairFuncao {
    public static void main(String args[]) {
        int a = 1, b = 2, c = 0, d = 0;

        c = adicao(a, b);
        d = adicao(a, c);

        imprimir(c);
        imprimir(d);
    }

    private static int adicao(int num1, int num2) {
        return num1 + num2;
    }

    private static void imprimir(int num) {
        System.out.println(num);
    }
}
