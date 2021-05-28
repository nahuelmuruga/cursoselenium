package clase7;

import java.util.Scanner;

public class Excepciones {
    public static void main (String arg[]){
        System.out.println("Bienvenida");
        Scanner tecalado = new Scanner(System.in);

        int num = -1;
        int suma =0 ;
        int contador = 0;

        while (num != 0){
            System.out.println("Ingrese un numero");
            num = tecalado.nextInt();
            suma = suma + num;
            if (num != 0 ){
                contador++;
            }

        }
        System.out.println("el Promedio es: ");
        try {
            System.out.println( suma / contador);
        } catch (Exception ex) {
            System.out.println( "Ha ocurrido una excepcion " + ex.getMessage() );
            System.out.println("El promedio es 0");
        }


        System.out.println("Hasta Pronto...");

    }
}
