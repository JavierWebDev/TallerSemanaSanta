import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        String jugador;
        int numeroGoles;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del jugador:");
        jugador = sc.nextLine();

        System.out.println("Ingrese el número de goles anotados:");
        numeroGoles = sc.nextInt();

        if (numeroGoles >= 6) {
            System.out.println("El jugador " + jugador + " es un goleador.");
        } else {
            System.out.println("El jugador " + jugador + " no es un goleador.");
        }

        sc.close();
    }
}
