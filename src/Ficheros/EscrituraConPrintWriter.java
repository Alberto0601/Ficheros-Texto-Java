package Ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraConPrintWriter {
    static void main() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("informe.txt"))) {
            pw.println("===INFORME DE NOTAS===");
            pw.println();

            //Escribir con formato usando printf
            pw.printf("%-20s %5s%n", "Alumno","Nota");
            pw.println("--------------");
            pw.printf("%-20s %5.2f%n","Juan Pérez",8.5);
            pw.printf("%-20s %5.2f%n","María García",9.0);
            pw.printf("%-20s %5.2f%n","Pedro López",7.5);

            //Escribir diferentes tipos directamente
            pw.println();
            pw.print("Total alumnos");
            pw.println(3);
            pw.print("Nota Media");
            pw.print("8.33");

            //Verificar si hubo errores

            if (pw.checkError()){
                System.err.println("Hubo un error al escribir");
            }else{
                System.out.println("Informe generado correctamente");
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());//es del FileWriter
        }
    }//PrintWitter o BufferedWriter el que quiera
}
