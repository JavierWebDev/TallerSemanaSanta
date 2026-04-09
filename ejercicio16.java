import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        double altura = 0;
        int nRebotes = 0;
        double limite = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la altura desde donde cae la pelota: ");
        altura = sc.nextDouble();

        limite = altura / 5;

        while (altura > limite) {
            altura = altura - (altura * 0.10);

            nRebotes++;
        }

        System.out.println("La pelota rebota " + nRebotes + " veces antes de alcanzar el límite de " + limite + " metros.");

        sc.close();
    }
}
