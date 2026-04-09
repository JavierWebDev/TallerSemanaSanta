import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        int sueldo;
        int horasExtra;
        int categoria;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el sueldo base del trabajador:");
        sueldo = sc.nextInt();

        System.out.println("Introduce las horas extra trabajadas:");
        horasExtra = sc.nextInt();

        System.out.println("Introduce la categoría del trabajador (1, 2 o 3):");
        categoria = sc.nextInt();

        if (categoria == 1) {
            sueldo += horasExtra * 30;
        } else if (categoria == 2) {
            sueldo += horasExtra * 38;
        } else if (categoria == 3) {
            sueldo += horasExtra * 50;
        } else if (categoria == 4) {
            sueldo += horasExtra * 70;
        } else {
            System.out.println("Categoría no válida.");
            sc.close();
            return;
        }

        System.out.println("El sueldo total del trabajador es: " + sueldo);
        sc.close();
    }
}
