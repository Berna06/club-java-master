/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class PasoDeValor {

    //Paso por valor 
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);

        cambiarValor(x);
        System.out.println("x = " + x);

    }

    private static void cambiarValor(int arg) {
        arg = 20;
        System.out.println("arg = " + arg);
        //Paso por referencia se utilizara aqui para realizar la prueba
        PasoDeReferencia persona = new PasoDeReferencia();

        persona.cambiarNombre("Juan");
        System.out.println("valor del nombre " + persona.ObtenerNombre());
        modificarPersona(persona);
        System.out.println("valor nombre modificado:" + persona.ObtenerNombre());
    }

    private static void modificarPersona(PasoDeReferencia personaArg) {
        personaArg.cambiarNombre("Carlos");
    }

}
