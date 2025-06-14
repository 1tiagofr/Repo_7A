import java.util.Scanner;

public class VocalConOr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir un carácter al usuario
        System.out.print("Ingrese un solo carácter: ");
        char caracter = scanner.next().toLowerCase().charAt(0);  // Convertimos a minúscula

        // Verificar si es una vocal utilizando OR (||)
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println("Es una vocal.");
        } else {
            System.out.println("No es una vocal.");
        }

        scanner.close();
    }
}
