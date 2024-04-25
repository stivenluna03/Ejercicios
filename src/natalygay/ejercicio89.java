import java.util.Scanner;
public class ejercicio89{
public static void main(String[]args) {
    Scanner lector = new Scanner(System.in);
    System.out.print("Ingrese la distancia en metros");
    double distanciaMetros = lector.nextDouble();
    double distanciaKilometros = metrosAKilometros(distanciaMetros);
    System.out.println("La distancia en kilómetros es" + distanciaKilometros + " km");
    lector.close();
}
public static double metrosAKilometros(double metros) {
    return metros / 1000.0; // 1 kilómetro = 1000 metros
}
}
    