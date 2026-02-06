package EjemplosExamen;

import java.io.*;

public class CombinacionesLecturaEscritura {
    static void main() {

        try(BufferedReader br=new BufferedReader(new FileReader("entrada.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("salida_mayus.txt"))){
            String linea;
            while ((linea=br.readLine())!=null){
                bw.write(linea.toUpperCase());
                bw.newLine();
            }
            System.out.println("Contenido copiado con mayúsculas");
        }catch (IOException e){
            System.err.println("Error" + e.getMessage());
        }
    }
}
