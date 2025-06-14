import java.util.Scanner;

public class SumaParesConIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número para sumar los pares hasta ese valor: ");
        int num = sc.nextInt();

        int suma = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("Suma de los valores pares hasta " + num + " es: " + suma);
        sc.close();
    }
}
