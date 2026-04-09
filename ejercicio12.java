import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        boolean isActive = true;
        int totalCompra = 0;

        Scanner sc = new Scanner(System.in);

        while (isActive) {
            System.out.println("Ingresa la compra a sumar");
            totalCompra += sc.nextInt();

            System.out.println("¿Deseas ingresar otra compra? (s/n)");
            String respuesta = sc.next();

            if (respuesta.equalsIgnoreCase("n")) {
                isActive = false;
            }
        }
        System.out.println("El total de la compra es: " + totalCompra);

        sc.close();
    }
}
