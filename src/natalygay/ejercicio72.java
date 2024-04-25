import java.util.*;
public class ejercicio72 {
public static double calcularSalario(double horasTrabajadas, double tarifaPorHora) {
    double salario = 0;
    if (horasTrabajadas <= 40) {
        salario = horasTrabajadas * tarifaPorHora;
    } else {
        salario = 40 * tarifaPorHora;
        double horasExtras = horasTrabajadas - 40;
        double tarifaPorHoraExtra = tarifaPorHora * 1.5;  
        salario += horasExtras * tarifaPorHoraExtra;
    }
    return salario;
}
public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.print("Ingrese las horas trabajadas ");
    double horasTrabajadas = lector.nextDouble();
    System.out.print("Ingrese la tarifa por hora");
    double tarifaPorHora = lector.nextDouble();
    double salario = calcularSalario(horasTrabajadas, tarifaPorHora);
    System.out.println("El salario del trabajador es" + salario);
    lector.close();
    }
}