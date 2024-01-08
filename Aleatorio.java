import java.util.Scanner;

//Ejercicio adivinar número
public class Aleatorio {
    public static void main(String[] args) {
        //for (int i = 0; i < 10; i++) {
        //System.out.println(getNumeroAleatorio(0,100));
        int numero, numero_aleatorio;
        //para declarar los intentos
        int min = 1;
        int max = 10;
        int intentos = 0;

        numero_aleatorio = getNumeroAleatorio(min, max);
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Dime un número");
            numero = leer.nextInt();
        intentos++;
            if (numero > numero_aleatorio) {
                System.out.println("El número es menor");
            } else if (numero < numero_aleatorio) {
                System.out.println("El número es mayor");
            }
        } while (numero != numero_aleatorio & intentos<10);

        if(numero==numero_aleatorio) {
            System.out.println("Enhorabuena, has acertado en " + intentos + " intentos.");
        }else{
            System.out.println("Enhorabuena, has perdido en " + intentos + " intentos.");
        }
    }

    private static int getNumeroAleatorio(int min, int max) {

        int numero_aleatorio = (int) ((Math.random() * ((max - min) + 1)) + min);
        return numero_aleatorio;

    }
}







