import java.util.Scanner;
public class ejercicio85 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = lector.nextInt();
        if (esPar(numero)) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }
        lector.close();
    }
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}