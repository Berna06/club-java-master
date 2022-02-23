/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author bernardo
 */
public class PalabraFinalEjemplo {

    public static void main(String[] args) {
        //modificar atributo final pero como los atributos ya estan modificados no se puede esta accion 
        //PalabraFinal.VAR_PRIMITIVO = 20;
        //PalabraFinal.VAR_PERSONA = new Persona()

        PalabraFinal.VAR_PERSONA.setNombre("juan");
        System.out.println(PalabraFinal.VAR_PERSONA.getNombre());
        PalabraFinal.VAR_PERSONA.setNombre("Sanchez");
        System.out.println(PalabraFinal.VAR_PERSONA.getNombre());
    }
}
