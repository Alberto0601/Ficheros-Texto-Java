package Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichero {
    static void main() {
        try (BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"))) {
            String linea;//siempre se declara
            int contador = 1;

            //Lee linea a linea hasta el final
            while ((linea = br.readLine()) != null) {//bucle while que rompe cuando se termina de leer
                System.out.println(contador + ". " + linea);
                contador++;
            }
        } catch (IOException e) {

        }
    }
}
