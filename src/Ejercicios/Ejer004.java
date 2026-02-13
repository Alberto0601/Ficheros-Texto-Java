package Ejercicios;

import java.io.*;

public class Ejer004 {
    static void main() {
        try (BufferedReader contenido=new BufferedReader(new FileReader("numeros.txt"));
             BufferedWriter escritura=new BufferedWriter(new FileWriter("numerosFinales.txt"))){

            String linea=null;
            while ((linea=contenido.readLine())!=null){
                    //Integer.parseInt(linea);
                    //escritura.write(linea);
            }

        }catch (IOException e){
            System.err.println("Error en el archivo "+e.getMessage());
        }
    }
}
