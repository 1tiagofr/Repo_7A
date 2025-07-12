import java.util.Random;

public class ejercicio19 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int contador = 0;
        int suma = 0;

        while (contador < 10) {
            int num = rnd.nextInt(100);  // Número aleatorio entre 0 y 99
            System.out.println("Número " + (contador + 1) + ": " + num);
            suma += num;
            contador++;
        }

        double promedio = suma / 10.0;
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
