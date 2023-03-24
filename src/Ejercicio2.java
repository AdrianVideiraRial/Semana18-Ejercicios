import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    /**
     * Crea un método que reciba por parámetro una ruta y/o nombre de fichero.
     * El método debe devolver, formateado como cadena de caracteres, el valor
     * del fichero. Si hubo algún error, debe de envíar la cadena del error.
     */


    /**
     * @autor Adrian Videira
     * @version 1.0
     */

    private static String nombreOrutaFichero;


    public static void leerFichero (){
        Scanner memoria = new Scanner(System.in);
        System.out.println("Escribe al nombre del fichero o la ruta del mismo");
        nombreOrutaFichero = memoria.nextLine();

        FileReader lector = null;
        try {
            lector = new FileReader(nombreOrutaFichero); //Creamos el lector
            int caracter = 0; //variable de tipo Int: porque el metodo .read () traduce el codigo binario y devuelve numeros enteros
            /**
             * Inicializamos la variable caracter con 0 porque si usamos la funcion .read antes de entrar en el bucle
             * while, leerá el primer caracter fuera del bucle y nos devolvera el texto sin la primera letra.
            */
            while(caracter!=-1) {
                caracter = lector.read();
                char traductor = (char) caracter;
                System.out.print(traductor);
            }
        } catch (IOException e){
            System.out.println("Ha ocurrido un error");
        }
    }



}
