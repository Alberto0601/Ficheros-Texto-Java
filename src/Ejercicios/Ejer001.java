package Ejercicios;

import javax.print.DocFlavor;
import java.io.*;

public class Ejer001 {
    static void main() {

        try (BufferedWriter libro = new BufferedWriter(new FileWriter("Arbol Ciencia.txt",true))) {
            libro.write(""" 
                    Se considera que “El árbol de la ciencia” es una de las obras capitales de Baroja. 
                    La escribió en época de plenitud completa y apareció en la biblioteca "Renacimiento", 
                    en 1911. La vida de Andrés Hurtado, como estudiante de Medicina en el Madrid de finales 
                    del siglo XIX, es, en gran parte, la vida del novelista, que, en general, no conservaba 
                    muy buenos recuerdos de sus profesores.\s
                    """);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("Arbol Ciencia.txt"))) {

            String linea;
            int contador = 1;
            while ((linea = br.readLine()) != null) {
                System.out.println(contador + ". " + linea);
                contador++;
            }

        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
    }
}
