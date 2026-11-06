public class Ej6 {
    static int convertir(String txt) {
        System.out.println("convertir " + txt);
        return Integer.parseInt(txt);
    }

    static int dividir(String a, String b) {
        int x = convertir(a);
        int y = convertir(b);
        return x / y;
    }

    public static void main(String[] args) {
        String[][] pares = { {"8", "5"}, {"7", "0"}, {"7", "dos"} };
        for (String[] p : pares) {
            try {
                System.out.println("=" + dividir(p[0], p[1]));
            } catch (ArithmeticException e) {
                System.out.println("se divide entre 0");
            } catch (NumberFormatException e) {
                System.out.println("digito no numerico");
            }
        }
    }
}