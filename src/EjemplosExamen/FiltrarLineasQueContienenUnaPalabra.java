package EjemplosExamen;

import java.io.*;

public class FiltrarLineasQueContienenUnaPalabra {
    static void main() {
        try(BufferedReader br=new BufferedReader(new FileReader("original.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("filtrado.txt"))){
            String linea;
            while ((linea=br.readLine())!=null){
                if (linea.contains("importante")){
                    bw.write(linea);
                    bw.newLine();
                }
            }
        }catch (IOException e){
            System.err.println("Error "+e.getMessage());
        }
    }
}
