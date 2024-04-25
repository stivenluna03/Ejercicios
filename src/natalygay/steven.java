import java.util.*;
public class steven {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrse el valor de n:");
        int n = lector.nextInt();
        int resultado = calcularExpresion(n);        
        System.out.println("El resultado de la expresión es: " + resultado);      
        lector.close();
    }
    public static int calcularExpresion(int n) {
        int resultado = 0;
        int signo = 1;       
        for (int i = 1; i <= n; i++) {
            resultado += signo * i;
            signo *= -1;
        }       
        return resultado;
    }
}