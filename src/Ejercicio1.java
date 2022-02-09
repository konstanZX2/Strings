import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaneado = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto");
        String cadena1;
        String cadena2;
        cadena1 = escaneado.next();
        System.out.println("Introduce la segunda cadena");
        cadena2 = escaneado.next();


        if (cadena1.equals(cadena2)){
            System.out.println("Las dos cadenas son iguales");}
        else if (cadena1.compareTo(cadena2)<0){
            System.out.println("Cadena 1 es mas grande que cadena 2");}
        else if (cadena1.compareTo(cadena2)>0){
            System.out.println("Cadena 1 es mas pequeña que cadena 2");
        }
    }
}
