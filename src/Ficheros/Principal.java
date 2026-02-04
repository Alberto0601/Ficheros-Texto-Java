package Ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    static void main() {
        FileWriter fw = null;

        try {
            fw = new FileWriter("datos.txt");

            fw.write("Primera linea\n");
            fw.write("Segunda linea\n");
            fw.write("Tercera linea\n");
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }//Forma incorrecta de hacerlo
    }
}
