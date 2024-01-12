//4. Escribir un programa Java que convierta una velocidad de Km/h a m/s.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);

        calculadora(leerDatos);
        //datos_personales(leerDatos);
    }


    private static void calculadora(Scanner leer) {

        System.out.print("Ingrese la velocidad en Km/h: ");
        double velocidadKmh = leer.nextDouble();

        double velocidadMs = velocidadKmh * (1000.0/3600.0);

        System.out.println("La velocidad " + velocidadKmh + " Km/h es equivalente a " + velocidadMs + " m/s.");
    }
}










