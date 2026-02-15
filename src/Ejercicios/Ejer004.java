package Ejercicios;

import java.io.*;

public class Ejer004 {
    static void main() {
        try (BufferedReader contenido=new BufferedReader(new FileReader("numeros.txt"));
             BufferedWriter escritura=new BufferedWriter(new FileWriter("numerosFinales.txt"))){

            String linea=null;
            while ((linea=contenido.readLine())!=null){
                    int leerNums=Integer.parseInt(linea);

                    if (leerNums%2==0){
                        System.out.println("Es par "+linea);
                    }
                    else {
                        System.out.println("Es impar "+ linea);
                    }
            }

        }catch (IOException e){
            System.err.println("Error en el archivo "+e.getMessage());
        }
    }
}
