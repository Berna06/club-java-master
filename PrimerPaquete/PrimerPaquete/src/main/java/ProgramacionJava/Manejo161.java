package ProgramacionJava;

import static ProgramacionJava.Archivos161.*;

public class Manejo161 {

    public static void main(String[] args) {
        String nombreArchivo = "c:\\pruebaJava\\archivoPruebaJava.txt";
        //creamos un archivo
        crearArchivo(nombreArchivo);
        
        //escribir archivo 
        escribirArchivo(nombreArchivo);
        
    }
}
