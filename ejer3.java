import java.util.Scanner;

public class ejer3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos el nombre del mes
        System.out.print("Ingrese el nombre de un mes: ");
        String mes = scanner.nextLine().toLowerCase(); // Lo pasamos a minúsculas para comparar fácilmente

        String mensaje;

        // Determinar la cantidad de días con un switch
        switch (mes) {
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                mensaje = "El mes de " + capitalizar(mes) + " tiene 30 días.";
                break;
            case "febrero":
                mensaje = "El mes de Febrero tiene 28 días (o 29 si es año bisiesto).";
                break;
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                mensaje = "El mes de " + capitalizar(mes) + " tiene 31 días.";
                break;
            default:
                mensaje = "El nombre del mes ingresado no es válido.";
        }

        System.out.println(mensaje);
        scanner.close();
    }

    // Método auxiliar para capitalizar la primera letra
    public static String capitalizar(String palabra) {
        if (palabra == null || palabra.isEmpty()) return palabra;
        return palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
    }
}
