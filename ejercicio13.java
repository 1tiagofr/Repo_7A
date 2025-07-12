import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del mes
        System.out.print("Ingrese el nombre del mes: ");
        String mes = scanner.nextLine().toLowerCase(); // Convertimos a minúsculas para facilitar comparación

        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println(capitalizar(mes) + " tiene 31 días.");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println(capitalizar(mes) + " tiene 30 días.");
                break;
            case "febrero":
                System.out.println(capitalizar(mes) + " tiene 28 días (29 si es año bisiesto).");
                break;
            default:
                System.out.println("El nombre del mes ingresado no es válido.");
        }

        scanner.close();
    }

    // Método para poner la primera letra en mayúscula (opcional, solo para mejor presentación)
    public static String capitalizar(String texto) {
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }
}
