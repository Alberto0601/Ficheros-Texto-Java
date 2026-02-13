package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.IllegalFormatCodePointException;

public class Ejer005Examen {
    static void main() {
        try (BufferedReader br = new BufferedReader(new FileReader("BlackSEO.html"))) {
            String linea = null;
            while ((linea = br.readLine()) != null) {

                if (linea.contains("font-size:0px;")||linea.contains("display:none;")||linea.contains("visibility:hidden;")) {
                    System.out.println("Posible Black SEO " + linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
    }
}
