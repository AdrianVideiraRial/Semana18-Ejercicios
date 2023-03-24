import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

    /**
     * Crea un método que reciba por parámetro una cadena de caracteres y
     * una ruta y/o nombre de fichero. El método debe almacenar la cadena de
     * caracteres en el lugar indicado y devolver una señal si fue capaz de
     * completar la acción o no.
     */


    /**
     * @autor Adrian Videira
     * @version 1.0
     */

    private static String nombreFichero;
    private static String mensaje;


    public static void recibirParametros (){
        Scanner memoria = new Scanner(System.in);
        System.out.println("Escribe un nombre para el fichero");
        nombreFichero = memoria.nextLine();
        System.out.println("Ecribe el mensaje a guardar");
        mensaje = memoria.nextLine();

        try {
            FileWriter ficheroEntrada = new FileWriter(nombreFichero);
            ficheroEntrada.write(mensaje);
            ficheroEntrada.close();
            System.out.println("Enhorabuena!! El archivo se ha generado correctamente");
        }
        catch (IOException e) {
            System.out.println("Ha ocurrido un error");
        }

    }



}
