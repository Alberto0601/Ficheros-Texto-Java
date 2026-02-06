package EjemplosExamen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFicherosBufferedWritter {
    static void main() {
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("salida.txt"))) {
            bw.write("Esta es la primera linea");
            bw.newLine();
            bw.write("Y esta es la segunda línea");
            bw.newLine();
            bw.write("¡El fichero se ha escrito correctamente!");
        }catch (IOException e){
            System.err.println("Error" + e.getMessage());
        }
    }
}
