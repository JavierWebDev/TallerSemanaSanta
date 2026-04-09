import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        
        int totalAprobados = 0;
        int totalDesaprobados = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del alumno #" + (i + 1) + ": ");
            int nota = sc.nextInt();

            if (nota >= 7) {
                totalAprobados++;
            } else {
                totalDesaprobados++;
            }

        }

        System.out.println("Total de alumnos aprobados: " + totalAprobados);
        System.out.println("Total de alumnos desaprobados: " + totalDesaprobados);

        sc.close();

    }
}
