import java.util.Scanner;
public class ejercicio96 {
        public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();
        String[] palabras = frase.split(" ");
        System.out.println("Palabras y sus longitudes:");
        for (String palabra : palabras) {
            System.out.println(palabra);
            System.out.println("Longitud: " + palabra.length());
        }
        lector.close();
    }
}