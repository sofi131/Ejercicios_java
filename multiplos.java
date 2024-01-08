import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Dime un número del 1 al 100");
        int numero = leerDatos.nextInt();
        multiplos(numero);
    }

    private static void multiplos(int numero){
        String cadena = null;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                cadena = "x, x, x";
            } else if (i % 3 == 0) {
                cadena = "3, 3, 3";
            } else if (i % 5 == 0) {
                cadena = "5, 5, 5";
            } else {
                cadena = "";
            }
            if (i == numero) {
                System.out.println(cadena);
            }
        }
    }
}
