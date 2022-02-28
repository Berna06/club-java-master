/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class Arreglos {

    public static void main(String[] args) {

        //1. Declaramos una variable tipo arreglo, un arreglo de tipo int  
        int edades[];
        //2. Intanciamos el arreglo de tipo int 
        edades = new int[3];
        //3. Inicialisamos los valores de los elementos del arreglo
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        //4. Imprimimos los valores del arreglo 
        System.out.println("Arreglo de enteros indice 0:" + edades[0]);
        System.out.println("Arreglo de enteros indice 1:" + edades[1]);
        System.out.println("Arreglo de enteros indice 2:" + edades[2]);

        //arreglos de tipo object
        Persona26 persona[] = new Persona26[4];
        //Inicialicemos los valores del arreglo 
        persona[0] = new Persona26("Juan");
        persona[2] = new Persona26("Lesli");
        persona[3] = new Persona26("Carlos");
        //IMprimimos los valores 
        System.out.println("Arreglo de objetos 0:" + persona[0]);
        System.out.println("Arreglo de objetos 1:" + persona[1]);
        System.out.println("Arreglo de objetos 2:" + persona[2]);
        System.out.println("Arreglo de objetos 3:" + persona[3]);

        //Arreglo de notacion simplificada 
        System.out.println("Grand The Auto");
        String nombres[] = {"big Smoke", "Berna", "Capitan America", "Carl Jonsoch(CJ)"};
        //imprimir los valores de este arreglo 
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo String Indice:" + i + ":" + nombres[i]);
        }

    }
}
