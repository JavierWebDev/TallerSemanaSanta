import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        int precioVehiculo;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del vehículo: ");
        precioVehiculo = sc.nextInt();

        int cuotaInicial = precioVehiculo * 35 / 100;

        int cuotaMensual = (precioVehiculo - cuotaInicial) / 18;

        System.out.println("La cuota inicial es: " + cuotaInicial);
        System.out.println("La cuota mensual es: " + cuotaMensual);
        sc.close();
    }
}
