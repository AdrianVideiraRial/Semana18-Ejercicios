
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Crea un método que reciba 3 parámetros: cadena de caracteres, una ruta
     * y/o nombre de fichero y un valor booleano que, si es true, añada valores al
     * final del fichero y si es false, sobreescriba el fichero. El método debe la
     * cadena de caracteres al fichero (bien al final o sobreescribiendo
     * dependiendo del tercer parámetro) e indicar si la operación fue completada con éxito o hubo algún error.
     */


    /**
     * @autor Adrian Videira
     * @version 1.0
     */

    private static String nombreFichero;
    private static String mensaje;
    private static String selector;//Este valor será analizado con la funcion .equalsIgnoreCase que devuelve un booleano.
    private static String mensajeExtra;
    private static String nuevoMensaje;


    public static void recibirParametrosModificables () {
        Scanner memoria = new Scanner(System.in);
        System.out.println("Escribe un nombre y/o ruta para el fichero");
        nombreFichero = memoria.nextLine();
        System.out.println("Ecribe el mensaje a guardar");
        mensaje = memoria.nextLine();
        System.out.println("Escribe 'si' para añadir un mensaje al final del fichero " +
                "o 'no' para sobreescribir fichero con texto nuevo");
        selector = memoria.nextLine();

        try {
            FileWriter ficheroEntrada = new FileWriter(nombreFichero);
            if (selector.equalsIgnoreCase("si")) { //OPCION A: Añadimos mensaje extra tras texto fichero.
                System.out.println("Escribe el mensaje que quieres añadir");
                mensajeExtra = memoria.nextLine();
                ficheroEntrada.write(mensaje + " " +mensajeExtra);
                ficheroEntrada.close();
            }if (selector.equalsIgnoreCase("no")){//OPCION B: Sobreescribimos texto del fichero.
                System.out.println("Escribe mensaje para sobreescribir fichero");
                nuevoMensaje = memoria.nextLine();
                ficheroEntrada.write(nuevoMensaje);
                ficheroEntrada.close();
            }
            System.out.println("Enhorabuena!! El archivo se ha generado correctamente");
        }
        catch (IOException e) {
            System.out.println("Ha ocurrido un error");
        }


    }







}
