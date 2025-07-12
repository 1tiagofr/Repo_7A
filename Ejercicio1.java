public class Ejercicio1 {

    public static void main(String[] args) {
        // Definir las tres notas del alumno
        double nota1 = 6.5;
        double nota2 = 8.0;
        double nota3 = 7.5;

        // Calcular el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Evaluar con un único if
        if (promedio >= 7) {
            System.out.println("Promedio: " + promedio);
            System.out.println("Resultado: Aprobado ✅");
        } else {
            System.out.println("Promedio: " + promedio);
            System.out.println("Resultado: Reprobado ❌");
        }
    }
}
