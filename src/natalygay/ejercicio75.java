import java.util.*;
public class ejercicio75 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el año ");
        int año = lector.nextInt();      
        if (esBisiesto(año)) {
            System.out.println(año + " es un año bisiesto");
        } else {
            System.out.println(año + " no es un año bisiesto");
        }
        lector.close();
    }   
    public static boolean esBisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        } else { 
            return false;
        }
    }
}