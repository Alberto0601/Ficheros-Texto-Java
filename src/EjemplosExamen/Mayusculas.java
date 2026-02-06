package EjemplosExamen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//LECTURA Y CONVERSIÓN DE TEXTO A MAYUSCULAS
public class Mayusculas {
    static void main() {
        try(BufferedReader br=new BufferedReader(new FileReader("texto.txt"))){
            String linea;
            while ((linea= br.readLine())!=null){//while para leer el documento
                String lineaMayusculas=linea.toUpperCase();//aquí lo paso a mayúsculas
                System.out.println(lineaMayusculas);
            }
        }catch(IOException e){
            System.err.println("Error al leer el fichero");
        }
    }
}
