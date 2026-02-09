package Ejercicios;

import java.io.*;

public class Ejer002 {
    static void main() {
        try(BufferedReader br=new BufferedReader(new FileReader("cartaEjer.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("cartaEjerFinal.txt"))){

            String linea=null;
            while ((linea=br.readLine())!=null){
                if (linea.contains("$")){
                    linea=linea.replace("$empresa","Damian SL ");
                    linea=linea.replace("$rrhh","Carmen rrhh");
                    linea=linea.replace("$departamento","departamento de informática");
                    linea=linea.replace("$cargo","departamento de informática");
                }

                bw.write(linea);
                bw.newLine();
            }

        }catch (IOException e){
            System.err.println("Error" +e.getMessage());
        }
    }
}
