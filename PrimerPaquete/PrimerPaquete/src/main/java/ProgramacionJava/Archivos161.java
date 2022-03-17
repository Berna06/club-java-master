package ProgramacionJava;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos161 {
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("El archivo se ha creado correctamente:");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void escribirArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            String contenido = "contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de la escritura");
            salida.close();
            System.out.println("Se ha escrito correctamente al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
