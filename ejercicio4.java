import java.util.Scanner;

public class CategoriaFamiliar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una categoría
        System.out.print("Ingrese una categoría (a, b o c): ");
        String categoria = scanner.nextLine().toLowerCase(); // Convertimos a minúsculas por si el usuario ingresa A, B o C

        // Evaluar la categoría
        switch (categoria) {
            case "a":
                System.out.println("hijo");
                break;
            case "b":
                System.out.println("padres");
                break;
            case "c":
                System.out.println("abuelos");
                break;
            default:
                System.out.println("Categoría inválida. Ingrese solo a, b o c.");
        }

        scanner.close();
    }
}
