import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        int precioProducto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        precioProducto = sc.nextInt();

        if (precioProducto > 200) {
            System.out.println("El producto se paga en efectivo");
        } else {
            System.out.println("El producto se paga con tarjeta de crédito");
        }
        
        sc.close();
    }
}
