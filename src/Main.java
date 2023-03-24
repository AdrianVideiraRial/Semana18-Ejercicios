import java.io.*;

public class Main {
    public static void main(String[] args) {

       //Ejercicio1.recibirParametros();
       //Ejercicio3.recibirParametrosModificables();
       //Ejercicio2.leerFichero();



        //************************************************************************************************************

        /**EJERCICIO 4
         * Crea un método que reciba tres parámetros: un objeto, una ruta y/o nombre
         * de fichero y un valor booleano.
         * Se almacenará en el fichero indicado el objeto. Dependiendo del valor
         * booleano, se añadirá al final del fichero o no.
         */

        /**
         * Creamos un objeto de la clase persona
         * que será el objeto que enviaremos a un fichero en la memoria permante del pc.
         */

        Persona persona1 = new Persona();
        persona1.setNombre("Maria");
        persona1.setApellido("Rodriguez");
        persona1.setEdad(33);
        persona1.setDni("53554420K");



            try {
                ObjectOutputStream salidaFichero = new ObjectOutputStream(new FileOutputStream("FicheroObjeto.txt"));
                salidaFichero.writeObject(persona1);
                salidaFichero.close();

            }catch (IOException e) {
                System.out.println("Ha habido un error");
            }


            //*********************************************************************************************************

        /**EJERCICIO 5.
         * Crea un método que reciba por parámetro una ruta y/o nombre de fichero
         * para retornar valores de objetos almacenados. Ten en cuenta que no se
         * sabe que tipo de objeto va a devolver el método.
         */

        try{
            ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("FicheroObjeto.txt"));
            Persona personaEnFichero = (Persona) leerFichero.readObject();
            leerFichero.close();
            System.out.println(persona1);
        }catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }




        }
}
