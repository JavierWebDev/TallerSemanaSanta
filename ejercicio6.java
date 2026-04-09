import java.util.Scanner;

public interface ejercicio6 {
    public static void main(String[] args) {
        double sueldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el sueldo del empleado: ");
        sueldo = sc.nextDouble();

        if (sueldo >= 1000000) {
            sueldo = sueldo * 1.12;

        } else {
            sueldo = sueldo * 1.15;
        }
        
        System.out.println("El sueldo del empleado es: " + sueldo);
        sc.close();
    }
}
