import java.util.*;
public class ejercicio79 {
        public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int voltajePorBombillo = 120;
        System.out.print("Ingrese el número de bombillos: ");
        int numBombillos = lector.nextInt();
        int voltajeTotal = voltajePorBombillo * numBombillos;
        double voltajeKilovoltios = voltajeTotal / 1000.0;
        System.out.println("El voltaje total en kilovoltios es: " + voltajeKilovoltios + " kV");
        lector.close();
    }
}