public class Promedio {
    static int promedio(int[] notas) {
        int suma = 0;
        for (int n : notas) {
            suma += n;
        }
        return suma / notas.length;
    }

    public static void main(String[] args) {
        int[][] grupos = { {1, 2, 9}, {}, {3} };
        for (int[] g : grupos) {
            try {
                System.out.println("Promedio: " + promedio(g));
            } catch (ArithmeticException e) {
                System.out.println("Equipo sin notas");
            }
        }
    }
}