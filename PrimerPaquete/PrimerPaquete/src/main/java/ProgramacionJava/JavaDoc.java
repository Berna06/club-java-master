/*
*Derechos reservado a Ubaldo Acosta-Cursos Java
 */
package ProgramacionJava;

/**
 * Clase para probar JavaDoc-Aritmetica32
 *
 * @author Bernardo
 * @version 1.0.2
 */
public class JavaDoc {

    /**
     * metodo para poner a prueba
     *
     * @param args es un arreglo de tipo String de la linea de comandos
     */
    public static void main(String[] args) {
        Aritmetica32 aritmetica1 = new Aritmetica32(3, 2);
        int resultado = aritmetica1.sumar();
        System.out.println("resultado = " + resultado);
    }
    
}
