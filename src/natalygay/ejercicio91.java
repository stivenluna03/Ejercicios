import java.util.Scanner;
public class ejercicio91 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el nombre ");
        String nombre = lector.nextLine();
        System.out.print("Ingrese el apellido ");
        String apellido = lector.nextLine();
        System.out.print("Ingrese la edad ");
        int edad = lector.nextInt();
        System.out.print("Ingrese el número de celular ");
        String numeroCelular = lector.next();
        System.out.println("Datos ingresados");
        System.out.println("Nombre " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println("Edad " + edad);
        System.out.println("Número de celular " + numeroCelular);
        lector.close();
    }
}