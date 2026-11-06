public class Ej1 {
    public static void main(String[] args) {
        int[] divisores = { 2, 0, 5 };
        int total = 0;
        for (int d : divisores) {
            try {
                total += 20 / d;
                System.out.println("de acuerdo en: " + d);
            } catch (ArithmeticException e) {
                System.out.println("fallas con " + d);
            }
            System.out.println("total de = " + total);
        }
    }
}