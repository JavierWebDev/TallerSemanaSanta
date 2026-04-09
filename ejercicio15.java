public class ejercicio15 {
    public static void main(String[] args) {

        int parejas = 0;

        int primero = 0, segundo = 1;
        
        for (int i = 1; i <= 55; i++) {
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
            
            if (siguiente % 2 == 0) {
                parejas++;
            }
        }

        System.out.println("El número de parejas es: " + parejas);

    }
}
