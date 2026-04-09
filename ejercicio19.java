import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        int mayorA300 = 0;
        int menorA300 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de sueldos a evaluar: ");
        int nSueldos = sc.nextInt();

        for (int i = 0; i < nSueldos; i++) {
            System.out.println("Ingrese el sueldo #" + (i + 1) + ": ");
            int sueldo = sc.nextInt();

            if (sueldo <= 500 && sueldo >= 100) {
                if (sueldo < 300 && sueldo >= 100) {
                    menorA300++;
                } else if (sueldo >= 300 && sueldo <= 500) {
                    mayorA300++;
                }
               
            } else {
                System.out.println("El sueldo ingresado no es válido. Debe estar entre 100 y 500.");
            }
        }

        System.out.println("Cantidad de sueldos menores a 300: " + menorA300);
        System.out.println("Cantidad de sueldos mayores o iguales a 300: " + mayorA300);

        sc.close();
    }
}
