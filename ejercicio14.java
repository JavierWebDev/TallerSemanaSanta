import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        int numero;
        int sum = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        for (int i = numero; i >= 1; i--) {
            sum *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + sum);

        sc.close();
    }
}
