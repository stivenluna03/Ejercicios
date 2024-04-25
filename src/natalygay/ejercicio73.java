import java.util.*;
public class ejercicio73 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = lector.nextDouble();       
        double descuento = calcularDescuento(sueldo);
        double sueldoNeto = sueldo - descuento;       
        System.out.println("Descuento: " + descuento);
        System.out.println("Sueldo neto: " + sueldoNeto);
        lector.close();
    }
    public static double calcularDescuento(double sueldo) {
        double descuento;    
        if (sueldo <= 1000) {
            descuento = sueldo * 0.10;
        } else if (sueldo <= 2000) {
            double adicional = sueldo - 1000;
            descuento = 1000 * 0.10 + adicional * 0.05;
        } else {
            double adicional = sueldo - 2000;
            descuento = 1000 * 0.10 + 1000 * 0.05 + adicional * 0.03;
        } 
        return descuento;
    }
}