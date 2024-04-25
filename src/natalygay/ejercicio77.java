import java.util.*;
public class ejercicio77 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el capital del préstamo: ");
        double capital = lector.nextDouble();
        System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
        double tasaInteresAnual = lector.nextDouble();
        System.out.print("Ingrese el número de años: ");
        int anos = lector.nextInt();
        double tasaInteresMensual = tasaInteresAnual / 12 / 100;
        int numeroPagos = anos * 12;
        double cuotaMensual = (capital * tasaInteresMensual) /
                (1 - Math.pow(1 + tasaInteresMensual, -numeroPagos));  
        double totalPagar = cuotaMensual * numeroPagos;
        System.out.println("La cuota mensual a pagar es: " + cuotaMensual);
        System.out.println("El total a pagar es: " + totalPagar);
        lector.close();
    }
}