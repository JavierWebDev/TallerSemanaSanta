import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Matricula: ");
        String matricula = sc.nextLine();

        System.out.print("Carrera (Sistemas/Medicina/Derecho): ");
        String carrera = sc.nextLine();

        System.out.print("Semestre: ");
        sc.nextInt();

        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        boolean apto = false;

        if (carrera.equalsIgnoreCase("Sistemas") && promedio >= 8.5) {
            apto = true;
        } else if (carrera.equalsIgnoreCase("Medicina") && promedio >= 9.0) {
            apto = true;
        } else if (carrera.equalsIgnoreCase("Derecho") && promedio >= 8.0) {
            apto = true;
        }

        if (apto) {
            System.out.println("El alumno " + matricula + " ES APTO para una facultad menor.");
        } else {
            System.out.println("El alumno " + matricula + " NO es apto para una facultad menor.");
        }

        sc.close();
    }
}
