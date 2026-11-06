public class Ej3 {
    static int nivel3(int d) {
        System.out.println(" entrada de nivel 3");
        return 10 / d;
    }

    static int nivel2(int d) {
        System.out.println(" entrada de nivel 2");
        try {
            return nivel3(d);
        } catch (ArithmeticException e) {
            System.out.println(" nive l2 atrapado");
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("resultado de: " + nivel2(0));
        System.out.println("resultado de: " + nivel2(5));
    }
}