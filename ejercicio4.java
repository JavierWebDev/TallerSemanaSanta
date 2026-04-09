import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int sonidos;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de sonidos que el grillo emite por minuto:: ");
        sonidos = sc.nextInt();

        int temperatura = (sonidos / 4) + 40;
        
        System.out.println("La temperatura es: " + temperatura);
        sc.close();
    }
}
