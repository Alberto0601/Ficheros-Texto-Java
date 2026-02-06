package EjemplosExamen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineasConFicheros {
    static void main() {
        try(BufferedReader br=new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            int contador=0;
            while ((linea=br.readLine())!=null){
                contador++;
            }
            System.out.println("El fichero tiene "+contador+"lineas");
        }catch (IOException e){
            System.err.println("Error "+e.getMessage());
        }
    }
}
