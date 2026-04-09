import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");
        int numero = sc.nextInt();

        System.out.print("Ingrese el limite: ");
        int limite = sc.nextInt();

        System.out.println("Multiplos de " + numero + " hasta " + limite + ":");
        
        for (int i = numero; i <= limite; i += numero) {
            System.out.println(i);
        }

        sc.close();
    }
}
