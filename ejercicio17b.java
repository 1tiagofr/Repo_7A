import java.util.Scanner;

public class ejercicio17b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número para sumar los pares hasta ese valor: ");
        int num = sc.nextInt();

        // El mayor número par <= num
        int maxPar = (num % 2 == 0) ? num : num - 1;
        int cantidadPares = maxPar / 2;

        // Suma = 2 + 4 + 6 + ... + maxPar = 2*(1 + 2 + ... + cantidadPares)
        int suma = 2 * (cantidadPares * (cantidadPares + 1) / 2);

        System.out.println("Suma de los valores pares hasta " + num + " es: " + suma);
        sc.close();
    }
}
