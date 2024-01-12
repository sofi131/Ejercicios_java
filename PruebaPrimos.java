//mismo que ArraysAleatorios
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PruebaPrimos {
    public static void main(String[] args) {
        int[] numeros;
        int[] numerosPrimos;

        numeros = new int[20];
        //clase de java - random
        Random aleatorios = new Random();

        //método crear números aleatorios

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorios.nextInt(0, 100);
        }
        //saca aleatorios
       // System.out.println(Arrays.toString(numeros));
        int contador = 0;
        //función es primo la creamos
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                contador++;
            }
        }
        numerosPrimos= new int[contador];
        int j=0;
        for (int i = 0; i < numeros.length; i++){
            if(esPrimo(numeros[i])){
                numerosPrimos[j]=numeros[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numerosPrimos));

    }
//para saber si ese número es primo o no
    private static boolean esPrimo(int numero) {
        if (numero > 1) {
            //de 2 porque 1 no interesa, ya es divisible - número menos 1//
            // return hace lo mismo que un break
            //
            for (int i = 2; i < numero - 1; i++) {
                // 6 entre 2 = 3 --> resto a 0, no es primo
                if (numero % i == 0) {
                    return false;
                }
            }
        }else{
        // 7 entre 2 --> resto no es 0, es primo
        return false;
        }
        return true;
    }
}
