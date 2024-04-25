import java.util.Scanner;
public class ejercicio84 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese su edad");
        int edad = lector.nextInt();
        System.out.println("Edad ingresada" + edad);
        lector.close();
    }
}