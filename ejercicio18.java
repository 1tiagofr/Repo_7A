public class ejercicio18 {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            System.out.println("Tabla del " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println(); // Línea en blanco entre tablas
        }
    }
}
