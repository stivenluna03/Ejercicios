import java.util.Scanner;
public class ejercicio87 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado del triángulo");
        double lado = lector.nextDouble();
        double area = (lado * lado * Math.sqrt(3)) / 4;
        System.out.println("Área del triángulo" + area);
        if (area > 1000) {
            System.out.println("DATOS NO VÁLIDOS");
        }
        lector.close();
    }
}