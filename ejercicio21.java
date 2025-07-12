import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese la categoría del empleado (A, B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0);

        System.out.print("Ingrese la antigüedad en años: ");
        int antiguedad = sc.nextInt();

        System.out.print("Ingrese el sueldo bruto: ");
        double sueldoBruto = sc.nextDouble();

        // Calcular aumento por antigüedad
        double aumento = 0;
        if (antiguedad >= 1 && antiguedad <= 5) {
            aumento = 0.05;  // 5%
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumento = 0.10;  // 10%
        } else if (antiguedad > 10) {
            aumento = 0.30;  // 30%
        }

        double sueldoConAumento = sueldoBruto + (sueldoBruto * aumento);

        // Plus por categoría
        double plus = 0;
        switch (categoria) {
            case 'A':
                plus = 1000;
                break;
            case 'B':
                plus = 2000;
                break;
            case 'C':
                plus = 3000;
                break;
            default:
                System.out.println("Categoría inválida, se asigna plus 0.");
        }

        // Calcular sueldo neto
        double sueldoNeto = sueldoConAumento + plus;

        // Mostrar resultado
        System.out.println("Sueldo bruto: $" + sueldoBruto);
        System.out.println("Aumento aplicado: " + (aumento * 100) + "%");
        System.out.println("Plus categoría: $" + plus);
        System.out.println("Sueldo neto a cobrar: $" + sueldoNeto);

        sc.close();
    }
}
