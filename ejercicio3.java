import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de dias: ");
        int dias = sc.nextInt();

        int segundos = dias * 24 * 60 * 60;

        System.out.println("El numero de segundos en " + dias + " dias es: " + segundos);
        sc.close();
    }
}