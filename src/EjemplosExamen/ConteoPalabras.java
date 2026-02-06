package EjemplosExamen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConteoPalabras {
    static void main() {
        try(BufferedReader br=new BufferedReader(new FileReader("documento.txt"))) {
            String linea;
            int totalPalabras=0;
            while ((linea= br.readLine())!=null){//leer el documento
                String[]palabras=linea.split("");//creo un array de palabras
                totalPalabras+=palabras.length;//+= --> totalPalabras=totalPalabras+palabras.length
            }
            System.out.println("Total de palabras en el fichero: "+ totalPalabras);
        }catch (IOException e){
            System.err.println("Error "+e.getMessage());
        }
    }
}
