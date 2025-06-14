import java.util.Scanner;

public class Empleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la categoría del empleado (A, B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0);

        System.out.print("Ingrese la antigüedad en años: ");
        int antiguedad = sc.nextInt();

        System.out.print("Ingrese el sueldo: ");
        double sueldo = sc.nextDouble();

        System.out.println("Empleado:");
        System.out.println("Categoría: " + categoria);
        System.out.println("Antigüedad: " + antiguedad + " años");
        System.out.println("Sueldo: $" + sueldo);

        sc.close();
    }
}
