import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        int nGoles1;
        int nGoles2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de goles del equipo 1:");
        nGoles1 = sc.nextInt();

        System.out.println("Introduce el número de goles del equipo 2:");
        nGoles2 = sc.nextInt();

        System.out.println("Equipo 1: " + nGoles1 + "\nEquipo 2: " + nGoles2);

        if (nGoles1 > nGoles2) {
            System.out.println("El equipo 1 gana");
        } else if (nGoles1 < nGoles2) {
            System.out.println("El equipo 2 gana");
        } else {
            System.out.println("Empate");
        }

        sc.close();
    }
}
