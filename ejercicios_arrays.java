import java.util.Scanner;

//1– Escribe un programa que pida 10 números por teclado,
// los almacene en un array y que luego muestre el máximo valor, el mínimo
// y las posiciones que ocupan en el array.
public class ejercicios_arrays {
    public static void main(String[] args) {
        int numeros[]=new int[10];
        Scanner leer = new Scanner(System.in);


        for (int i = 0; i < 10; i++) { //numero.length
            System.out.println("Introduce el número de la posición " +i);
            try {
                numeros[i] = leer.nextInt();
            }catch (Exception e){
                leer.nextLine();
                i--; //decrementar i - el for se incrementó en 1, y anula lo de arriba
                System.out.println("Número no válido");
            }

        }
print(numeros);
        maximo(numeros);
        }

private static void maximo(int[] num){
    int posMax=0,max=num[0];
    int posMin=0, min=num[0];

    for (int i = 0; i < num.length; i++) {
        if(max<num[i]){
            max=num[i];
            posMax=i;
        }
        if (min >num[i]) {
            min = num[i];
            posMin = i;
        }
        System.out.println("El máximo es " +max +" y está en la posición " + posMax);
        System.out.println("El mínimo es " +min +" y está en la posición " + posMin);
    }

}

private static void print(int[] a){
    String cadena="[";
    for (int i = 0; i < a.length; i++) {
        cadena+=a[i]+",";
    }
    cadena=cadena.substring(0, cadena.length() -1);
    cadena+="]"; //esto es visual
    System.out.println(cadena);
    }
  }


