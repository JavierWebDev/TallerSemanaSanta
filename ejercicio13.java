public class ejercicio13 {
    public static void main(String[] args) {
        long suma = 0;
        int termino = 0;
        boolean suma3 = true;

        while (termino <= 1800) {
            suma += termino;

            System.out.print( + termino + ", ");

            if (suma3) {
                termino += 3;
            } else {
                termino += 2;
            }

            suma3 = !suma3;
        }

        System.out.println("La suma final es: " + suma);

    }
}
