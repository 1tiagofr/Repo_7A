import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el puesto al usuario
        System.out.print("Ingrese el puesto que ocupó en el torneo (número entero): ");
        int puesto = scanner.nextInt();

        // Evaluar el puesto
        if (puesto == 1) {
            System.out.println("El primero obtiene la medalla de oro.");
        } else if (puesto == 2) {
            System.out.println("El segundo obtiene la medalla de plata.");
        } else if (puesto == 3) {
            System.out.println("El tercero obtiene la medalla de bronce.");
        } else {
            System.out.println("Siga participando.");
        }

        scanner.close();
    }
}
