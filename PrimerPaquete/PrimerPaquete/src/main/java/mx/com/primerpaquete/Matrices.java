/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class Matrices {
//Para realizar esta prueba se utilizo la clase de Persona26

    public static void main(String[] args) {
        //Creamosmuna matriz de tipo int 
        int edades[][];
        //instanciamos la matriz de int 
        edades = new int[3][2];
        // Instancian el valor de la matriz 
        edades[0][0] = 10;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 25;
        edades[2][0] = 30;
        edades[2][1] = 35;
        //imprimimos lso valores 
        System.out.println("Matriz de enteros en el indice:" + edades[0][0]);
        System.out.println("Matriz de enteros en el indice:" + edades[0][1]);
        System.out.println("Matriz de enteros en el indice:" + edades[1][0]);
        System.out.println("Matriz de enteros en el indice:" + edades[1][1]);
        System.out.println("Matriz de enteros en el indice:" + edades[2][0]);
        System.out.println("Matriz de enteros en el indice:" + edades[2][1]);

        //Declarar una matriz de tipo object 
        Persona26 persona[][] = new Persona26[1][2];
        //inicializamos los valores 
        persona[0][0] = new Persona26("Big Smoke");
        persona[0][1] = new Persona26("CJ");
        //imprimimos losvalores 
        System.out.println("Matriz de tipo object:" + persona[0][0]);
        System.out.println("Matriz de tipo object:" + persona[0][1]);
        for (int reglon = 0; reglon < persona.length; reglon++) {
            for (int columna = 0; columna < persona[reglon].length; columna++) {
                System.out.println("Matriz de Persona:" + reglon + "-" + columna + "-" + persona[reglon][columna]);
                //fin
            }
        }

    }

}
