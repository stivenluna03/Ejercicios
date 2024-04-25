import java.util.*;
public class ejercicio80 {
        public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un dato entero: ");
        int datoEntero = lector.nextInt();
        System.out.print("Ingrese un dato real: ");
        double datoReal = lector.nextDouble();
        System.out.println("Dato entero ingresado: " + datoEntero);
        System.out.println("Dato real ingresado: " + datoReal);
        lector.close();
    }
}