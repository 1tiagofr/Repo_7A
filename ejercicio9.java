import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("0 = Piedra, 1 = Papel, 2 = Tijera");

        // Ingresar jugadas de los jugadores
        System.out.print("Jugador 1, ingrese su jugada: ");
        int jugador1 = scanner.nextInt();

        System.out.print("Jugador 2, ingrese su jugada: ");
        int jugador2 = scanner.nextInt();

        // Verificar jugadas válidas
        if ((jugador1 >= 0 && jugador1 <= 2) && (jugador2 >= 0 && jugador2 <= 2)) {

            // Comprobar si hay empate
            if (jugador1 == jugador2) {
                System.out.println("Empate.");
            }
            // Usar AND (&&) en las condiciones para determinar si gana el Jugador 1
            else if ((jugador1 == 0 && jugador2 == 2) &&
                     (jugador1 != jugador2)) {
                System.out.println("Gana el Jugador 1 (Piedra vence a Tijera).");
            } else if ((jugador1 == 1 && jugador2 == 0) &&
                       (jugador1 != jugador2)) {
                System.out.println("Gana el Jugador 1 (Papel vence a Piedra).");
            } else if ((jugador1 == 2 && jugador2 == 1) &&
                       (jugador1 != jugador2)) {
                System.out.println("Gana el Jugador 1 (Tijera vence a Papel).");
            } else {
                System.out.println("Gana el Jugador 2.");
            }

        } else {
            System.out.println("Jugada inválida. Solo se permiten los valores 0, 1 o 2.");
        }

        scanner.close();
    }
}
