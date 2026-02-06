package EjemplosExamen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PalabrasEspecíficas {
    static void main() {
        try(BufferedReader br=new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            int numeroLinea=0;
            while ((linea=br.readLine())!=null){
                numeroLinea++;
                if (linea.contains("Java")){//si la linea contiene Java te dice en que linea se ha encontrado
                    System.out.println("Encontrado en línea: "+linea);
                }
            }
        }catch (IOException e){
            System.err.println("Error "+ e.getMessage());
        }
    }
}
