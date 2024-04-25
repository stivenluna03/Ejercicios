import java.util.*;
public class ejercicio74 {
      public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);        
        System.out.print("Ingrese el primer número");
        double num1 = lector.nextDouble();      
        System.out.print("Ingrese el segundo número");
        double num2 = lector.nextDouble();       
        System.out.print("Ingrese el tercer número");
        double num3 = lector.nextDouble();
        if (num1 < num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }      
        if (num1 < num3) {
            double temp = num1;
            num1 = num3;
            num3 = temp;
        }       
        if (num2 < num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("Números ordenados de mayor a menor " + num1 + ", " + num2 + ", " + num3);
        lector.close();
    }
}