import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        descomponer_numero(leerDatos);
        //calculadora(leerDatos);
        //datos_personales(leerDatos);
}

private static void descomponer_numero(Scanner leer){
    String numero;
    System.out.println("Dime un número de 3 cifras");
    numero= leer.nextLine();
    System.out.println(numero.charAt(0));
    System.out.println(numero.charAt(1));
    System.out.println(numero.charAt(2));
    }
}