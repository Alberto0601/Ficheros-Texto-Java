package Ejercicios;

import java.io.*;
import java.util.Arrays;

public class Ejer003 {
    static void main() {

        char[] letrasNumeros = {
                ' ','0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        String[] codigoMorse = {
                "/","-----",".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        try (BufferedReader br=new BufferedReader(new FileReader("fichero.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("morse.txt"))) {

            String linea=null;

            while ((linea=br.readLine())!=null){
                linea=linea.toUpperCase();/*poner tod mayus*/

                for (int i = 0; i < linea.length(); i++) {//recorremos caracter a caracter (char a char)
                    char letra=linea.charAt(i);//es una letra (la i es la del bucle)
                    //Buscamos la letra y nos quedamos con la posición la elegimos para escribir el morse
                    //para escribir el morse
                    int pos= Arrays.binarySearch(letrasNumeros,letra);//NUEVO, para buscar en arrays con binary Search
                    //codigoMorse[14] lo escribe en morse.txt
                    bw.write(codigoMorse[pos]);//de la posicion pos
                }
            }

        }catch (IOException e){
            System.err.println("Error en los ficheros "+ e.getMessage());
        }
    }
}
