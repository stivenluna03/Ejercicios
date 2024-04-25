import java.util.*;
public class ejercicio82 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un número");
        double numero = lector.nextDouble();
        if (numero > 0) {
            System.out.println("El número ingresado es positivo");
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo");
        } else {
            System.out.println("El número ingresado es cero");
        }
        lector.close();
    }
}