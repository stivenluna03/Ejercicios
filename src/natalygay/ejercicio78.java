import java.util.*;
public class ejercicio78 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el monto: ");
        double monto = lector.nextDouble();
        double descuento = calcularDescuento(monto);      
        System.out.println("El descuento aplicado es: " + descuento);
        lector.close();
    }
    public static double calcularDescuento(double monto) {
        double descuento;
        if (monto > 10000) {
            descuento = monto * 0.20;  // 20% de descuento para montos mayores a 10000
        } else {
            descuento = monto * 0.10;  // 10% de descuento para montos menores o iguales a 10000
        }
        return descuento;
    }
}