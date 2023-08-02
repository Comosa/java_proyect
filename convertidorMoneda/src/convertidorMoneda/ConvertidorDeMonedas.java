package convertidorMoneda;
import java.util.Scanner;

public class ConvertidorDeMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tasa de cambio fija (1 USD = 20 MXN)
        double tasaCambio = 20.0;

        System.out.print("Ingresa la cantidad en dólares: ");
        double cantidadUSD = scanner.nextDouble();

        double cantidadMXN = cantidadUSD * tasaCambio;

        System.out.println("Equivalente en pesos mexicanos: " + cantidadMXN + " MXN");

        scanner.close();
    }
}

