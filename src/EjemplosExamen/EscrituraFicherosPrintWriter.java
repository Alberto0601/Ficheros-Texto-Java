package EjemplosExamen;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraFicherosPrintWriter {
    static void main() {
        try(PrintWriter pw=new PrintWriter(new FileWriter("informe.txt"))) {
            pw.println("===INFORME DE VENTAS===");
            pw.println();
            pw.printf("Producto: %s - Precio: %.2f EUR%n", "Laptop", 999.99);
            pw.printf("Producto: %s - Precio: %.2f EUR%n", "Mouse", 25.50);
            pw.println();
            pw.println("Total: 1025.49 EUR");
        }catch (IOException e){
            System.err.println("Error "+ e.getMessage());
        }
    }
}
