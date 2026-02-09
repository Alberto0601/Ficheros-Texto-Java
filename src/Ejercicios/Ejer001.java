package Ejercicios;

import javax.print.DocFlavor;
import java.io.*;

public class Ejer001 {
    static void main() {
        System.out.println("CONTADOR DEL WORD");
        try (BufferedReader contenido = new BufferedReader(new FileReader("Doc.txt"));) { //muevo el fichero a un lugar y pongo la ruta
            String linea=null;
            int acumuladorCon=0;
            int contaParrafos = 0;//contar todos los párrafos
            int acumuladorPalabras=0;//contar todas las palabras
            int acumuladorSin=0;
            while ((linea = contenido.readLine()) != null) {
                if (linea.length()!=0){ //el if si no quiero trabajar con párrafos vacios
                contaParrafos++;//contar parrafos
                //Guardamos y acumulamos los caracteres por cada párrafo
                int caracteresCon=linea.length();
                acumuladorCon+=caracteresCon;
                //Guardamos y acumulamos las palabras, tamaño del array
                String[]parrafo=linea.split(" ");
                int contadorPal=parrafo.length;
                acumuladorPalabras+=contadorPal;
                //Ahora contamos las palabras sin espacio desde el párrafo[]
                int acumuladorLetras=0;
                for (String s: parrafo){
                    acumuladorLetras+=s.length();
                }
                acumuladorSin+=acumuladorLetras;
                }
            }
            System.out.println("Los párrafos son: " + contaParrafos);//una linea es un párrafo
            System.out.println("Caracteres con espacio: " +acumuladorCon);
            System.out.println("Palabras del texto: "+ acumuladorPalabras);
            System.out.println("Caracteres sin espacio: "+acumuladorSin);

        } catch (IOException e) {
            System.err.println("Error en la lectura" + e.getMessage());
        }

        System.out.println("FIN DEL PROGRAMA");
    }
}
