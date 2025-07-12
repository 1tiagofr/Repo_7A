import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el curso (número entero)
        System.out.print("Ingrese el número de curso (0 en adelante): ");
        int curso = scanner.nextInt();

        // Determinar el nivel educativo
        if (curso == 0) {
            System.out.println("jardín de infantes");
        } else if (curso >= 1 && curso <= 6) {
            System.out.println("primaria");
        } else if (curso >= 7 && curso <= 12) {
            System.out.println("secundaria");
        } else {
            System.out.println("Curso fuera de rango educativo definido.");
        }

        scanner.close();
    }
}
