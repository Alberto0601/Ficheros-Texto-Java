package Ejercicios;

import javax.print.DocFlavor;
import java.io.*;

public class Ejer001 {
    static void main() {
        System.out.println("CONTADOR DEL WORD");
        try(BufferedReader contenido=new BufferedReader(new FileReader("Doc.txt"));) { //muevo el fichero a un lugar y pongo la ruta
            String linea;
            int contador = 1;

            //Lee linea a linea hasta el final FALTA LEER PALABRAS,PÁRRAFOS y LEER CARACTERES CON ESPACIOS y SIN ESPACIOS
            while ((linea = contenido.readLine()) != null) {
                System.out.println(contador + ". " + linea);
                contador++;
            }
        }catch (IOException e){
            System.err.println("Error en el archivo" + e.getMessage());
        }
        System.out.println("Lectura correcta");
    }
}
