/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class EncapsulamientoPrueba {

    public static void main(String[] args) {
        Encapsulamiento persona = new Encapsulamiento("Juan", 5000, false);
//        System.out.println("nombre persona:" + persona.getNombre());
//        System.out.println("nombre sueldo:" + persona.getSueldo());
//        System.out.println("Persona borrada?" + persona.isEliminado());
        System.out.println("persona:" + persona.toString());
        persona.setNombre("Carlos");
        persona.setSueldo(3000);
        persona.setEliminado(true);
        //persona.nombre = "karla"
        System.out.println("nombre persona:" + persona.getNombre());
        System.out.println("nombre sueldo:" + persona.getSueldo());
        System.out.println("Persona borrada?" + persona.isEliminado());
    }

}
