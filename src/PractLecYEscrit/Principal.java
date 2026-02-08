package PractLecYEscrit;

import java.io.*;
import java.util.ArrayList;

public class Principal {
    static void main() {
        try (BufferedReader br=new BufferedReader(new FileReader("nombres.txt"));
             BufferedWriter bw=new BufferedWriter(new FileWriter("cartasFinales.txt"))
        ){
            String linea;
            ArrayList<String>nombres=new ArrayList<>();
            while ((linea=br.readLine())!=null){
                //arraylist de nombres la 0 el primer nombre, la 1 el segundo, etc..
                //leo el documento de nombres, y meto al arraylist segun voy leyendo..
                nombres.add(linea);
                //imprimo segun la posicion el nombre que toque en el otro documento... Recorro el array
            }

            for (int i = 0; i < nombres.size(); i++) {
                try(BufferedReader br2=new BufferedReader(new FileReader("carta.txt"));) {
                    linea="";
                    while ((linea=br2.readLine())!=null){
                        if (linea.contains("[NOMBRE]")){
                            linea=linea.replace("[NOMBRE]",nombres.get(i));
                        }
                        bw.write(linea);
                        bw.newLine();
                    }
                    bw.newLine();
                }catch (IOException e){
                    System.err.println("Error "+ e.getMessage());
                }
            }
        }catch (IOException e){
            System.err.println("Error" + e.getMessage());
        }
    }
}
