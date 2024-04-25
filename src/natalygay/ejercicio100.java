import java.util.Scanner;
public class ejercicio100 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = lector.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = lector.nextInt();
        int suma = numero1 + numero2;
        if (suma % 2 == 0) {
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es par.");
        } else {
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es impar.");
        }
        lector.close();
    }
}