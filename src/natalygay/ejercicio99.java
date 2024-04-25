import java.util.Scanner;
public class ejercicio99 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = lector.nextInt();
        boolean esBisiesto = esAnioBisiesto(anio);
        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
        lector.close();
    }
    public static boolean esAnioBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}