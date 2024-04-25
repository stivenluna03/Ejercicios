import java.util.*;
public class ejercicio76 {
        public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);        
        System.out.print("Ingrese un número entero: ");
        int numero = lector.nextInt();       
        int numeroCifras = contarCifras(numero);      
        System.out.println("El número de cifras en " + numero + " es: " + numeroCifras);
        lector.close();
    }   
    public static int contarCifras(int numero) {
        String numeroStr = String.valueOf(numero);
        return numeroStr.length();
    }
}