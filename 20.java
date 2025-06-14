import java.util.Random;

public class NumerosAzarMaxMin {
    public static void main(String[] args) {
        Random rnd = new Random();
        int contador = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        do {
            int num = rnd.nextInt(100);  // Número entre 0 y 99
            System.out.println("Número " + (contador + 1) + ": " + num);

            if (num > max) max = num;
            if (num < min) min = num;

            contador++;
        } while (contador < 10);

        System.out.println("Número máximo: " + max);
        System.out.println("Número mínimo: " + min);
    }
}
