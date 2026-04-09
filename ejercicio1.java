import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int capitalInicial;
        double interesMensual = 0.02;

        System.out.println("Ingresa el capital inicial:");
        capitalInicial = sc.nextInt();

        double capitalFinal = capitalInicial * (1 + interesMensual);

        System.out.println("El capital final después de un mes es: " + capitalFinal);
        
        sc.close();
    }
}
