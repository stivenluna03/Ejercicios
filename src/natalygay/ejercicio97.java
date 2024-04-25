import java.util.Scanner;
public class ejercicio97 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el consumo de la Termoeléctrica Manta en Kw: ");
        double consumoKw = lector.nextDouble();
        double porcentajeConsumo = (consumoKw / 10000) * 100;
        String eficienciaEnergetica;
        if (porcentajeConsumo >= 80 && porcentajeConsumo <= 100) {
            eficienciaEnergetica = "CONSUMO MEDIO";
        } else {
            eficienciaEnergetica = "ALTO CONSUMO DE ENERGÍA";
        }
        System.out.println("Eficiencia energética de la Termoeléctrica Manta:");
        System.out.println("Porcentaje de consumo: " + porcentajeConsumo + "%");
        System.out.println("Eficiencia energética: " + eficienciaEnergetica);
        lector.close();
    }
}