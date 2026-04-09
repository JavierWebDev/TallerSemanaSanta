import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        int nValidas = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de piezas a evaluar: ");
        int nPiezas = sc.nextInt();

        for (int i = 0; i < nPiezas; i++) {
            System.out.println("Ingrese la longitd de la pieza #" + (i + 1) + ": ");
            int longitud = sc.nextInt();

            if (longitud >= 1000000 && longitud <= 2000000) {
                nValidas++;
            }
        }

        System.out.println("Cantidad de piezas válidas: " + nValidas);

        sc.close();
    }
}
