import java.util.*;
public class ejercicio81 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = lector.nextDouble();
        double area = calcularAreaCirculo(radio);
        System.out.println("Área del círculo: " + area);
        if (area > 5000) {
            System.out.println("DATOS ERRÓNEOS");
        }
        lector.close();
    }
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}