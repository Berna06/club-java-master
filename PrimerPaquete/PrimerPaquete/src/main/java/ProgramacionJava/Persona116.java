/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionJava;

/**
 * Bloque de codigo
 *
 * @author bernardo
 */
public class Persona116 {

    private final int idPersona;
    private static int contadorPersonas;

    // bloque de inicializacion de codigo estatico
    static {
        contadorPersonas = 10;
        //No podemos utilizar variables NO estaticas dentro del bloque static 
        //idPersona = 2;
        System.out.println("Ejecutando bloque estatico");
    }

    //este bloque NO estatico se copia a cada objecto 
    {
        System.out.println("Ejecucion de bloque NO estatico ");
        this.idPersona = ++contadorPersonas;
    }

    Persona116() {
        System.out.println("Ejecucion del constructor");
    }

    public int getidPersona() {
        return this.idPersona;
    }

}
