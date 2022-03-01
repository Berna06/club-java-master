/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionJava;

/**
 *
 * @author Bernardo MOnroy Parra
 * @version 1.0.3
 */
public class ArgumentosVariables {

    public static void main(String[] args) {
        //imprimimos varios numeros 
        imprimirNumeros(5, 15, 20, 25, 30, 35, 40);
        //Parametros variables 
        System.out.println("");
        variosParametros("CJ", true, 32, 2, 14);

    }

    private static void variosParametros(String nombre, boolean bandera, int... numeros) {
        System.out.println("nombre = " + nombre);
        System.out.println("bandera = " + bandera);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elementos = " + numeros[i]);
        }
    }

    private static void imprimirNumeros(int... numeros) {
        //recoremos cada elemnto del arreglo
        for (int i = 0; i < numeros.length; i++) {
            int elemento = numeros[i];
            System.out.println("elemento = " + elemento);
        }
    }

}
