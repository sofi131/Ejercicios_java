import java.util.Scanner;

public class CalcularDNI {
    public static void main(String[] args) {

        String dni;
        Scanner leer = new Scanner(System.in);
        //bucle
        System.out.println("Dime un DNI");
        dni = leer.nextLine();
        if (verificarDNI(dni)) {
            System.out.println("DNI válido");
        } else {
            System.out.println("DNI no válido");
        }

    }
    private static boolean verificarDNI(String dni){
            String LETRASDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
            String letra;
            int numeroDNI, posLetra;
            try {
                if (dni.length() == 9) {
                    letra = dni.substring(8);
                    //wrap -> castear coge la clase int y la llama método parseint
                    numeroDNI = Integer.parseInt(dni.substring(0, 8));
                    //System.out.println(letra); para comprobar que de la letra
                    //System.out.println(numeroDNI); comprobar número
                    posLetra = numeroDNI % 23;
                    //comparar cadenas de txt
                    if (letra.toUpperCase().equals(String.valueOf(LETRASDNI.charAt(posLetra)))) {
                        return true;
                    } else {
                        return false;
                    }

                } else {
                    return false;
                }
            }catch(Exception e){
                return false;
            }
    }
}
