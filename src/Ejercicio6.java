import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escaneado = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto");
        String cadena1;
        char vocal1 = 'a';
        char vocal2 = 'o';
        cadena1 = escaneado.next();
        System.out.println("Introduce la vocal que quieres sustituir");
        vocal1 = escaneado.next().charAt(0);
        System.out.println("Introduce la vocal que vas a meter dentro que sustituira a la otra");
        vocal2 = escaneado.next().charAt(0);


        System.out.println(cadena1.replace(vocal1,vocal2));


    }
}
