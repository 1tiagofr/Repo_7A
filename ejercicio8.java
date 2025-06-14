import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instrucciones
        System.out.println("0 = Piedra, 1 = Papel, 2 = Tijera");

        // Ingresar jugadas
        System.out.print("Jugador 1, ingrese su jugada: ");
        int jugador1 = scanner.nextInt();

        System.out.print("Jugador 2, ingrese su jugada: ");
        int jugador2 = scanner.nextInt();

        // Verificar jugadas válidas
        if (jugador1 < 0 || jugador1 > 2 || jugador2 < 0 || jugador2 > 2) {
            System.out.println("Jugada inválida. Solo se permiten los valores 0, 1 o 2.");
        } else {
            // Determinar el ganador
            if (jugador1 == jugador2) {
                System.out.println("Empate.");
            } else if ((jugador1 == 0 && jugador2 == 2) ||
                       (jugador1 == 1 && jugador2 == 0) ||
                       (jugador1 == 2 && jugador2 == 1)) {
                System.out.println("Gana el Jugador 1.");
            } else {
                System.out.println("Gana el Jugador 2.");
            }
        }

        scanner.close();
    }
}
