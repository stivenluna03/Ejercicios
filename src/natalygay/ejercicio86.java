import java.util.Scanner;
public class ejercicio86 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double[] voltajes = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el voltaje " + (i + 1) + ": ");
            voltajes[i] = lector.nextDouble();
        }
        double promedio = calcularPromedio(voltajes);
        System.out.println("El promedio de los voltajes es: " + promedio);
        if (promedio > 220) {
            System.out.println("ALTO VOLTAJE");
        } else {
            System.out.println("VOLTAJE CORRECTO");
        }
        lector.close();
    }
    public static double calcularPromedio(double[] voltajes) {
        double suma = 0;
        for (double voltaje : voltajes) {
            suma += voltaje;
        }
        return suma / voltajes.length;
    }
}