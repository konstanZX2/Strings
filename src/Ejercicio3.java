import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escaneado = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto");
        String cadena1;
        String cadena2;
        String cadena3 = "hola";
        cadena1 = escaneado.next();
        System.out.println("Introduce la segunda cadena");
        cadena2 = escaneado.next();

        cadena3 = cadena1.concat(cadena2);
        System.out.println(cadena3);
    }
}
