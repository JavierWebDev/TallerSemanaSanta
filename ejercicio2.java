import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int metrosArena;
        double metrosRevoque;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa los metros cubicos de arena:");
        metrosArena = sc.nextInt();

        metrosRevoque = metrosArena * 0.5;

        System.out.println("Los metros cuadrados de revoque necesarios son: " + metrosRevoque);
        sc.close();
    }
}
