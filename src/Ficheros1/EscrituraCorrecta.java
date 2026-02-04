package Ficheros1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraCorrecta {
    static void main() {

        try (BufferedWriter contenido = new BufferedWriter(new FileWriter("alumnos.txt"));) {

            contenido.write("Juan Pérez");
            contenido.newLine();
            contenido.write("Maria García");
            contenido.newLine();
            contenido.write("Pedro López");
            contenido.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


