import java.util.Scanner;
public class ejercicio98 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        int valor1 = lector.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int valor2 = lector.nextInt();
        int suma = valor1 + valor2;
        int resta = valor1 - valor2;
        if (suma % resta == 0) {
            System.out.println("La división de la suma entre la resta es exacta.");
        } else {
            System.out.println("La división de la suma entre la resta no es exacta.");
        }
        lector.close();
    }
}