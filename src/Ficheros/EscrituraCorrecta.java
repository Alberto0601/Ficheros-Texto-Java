package Ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraCorrecta {
    static void main() {

        try (BufferedWriter contenido = new BufferedWriter(new FileWriter("alumnos.txt",true))) {//try with resources
        //el TRUE después de alumnos.txt es para que no se borre lo que ya tenía del archivo y se ponga debajo
            contenido.write("Juan Pérez");//string
            contenido.newLine();//salto de linea
            contenido.write("Maria García");
            contenido.newLine();
            contenido.write("Pedro López");
            contenido.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


