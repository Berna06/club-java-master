/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

import java.util.Date;

/**
 *
 * @author bernardo
 */
public class HerenciaPrueEnd {

    public static void main(String[] args) {
        HerenciaPru empleado1 = new HerenciaPru("Juan", 5000);
        empleado1.setEdad(28);
        empleado1.setDireccion("lomas 3");
        System.out.println(empleado1);
        HerenciaPru2 cliente1 = new HerenciaPru2(new Date(), true);
        cliente1.setNombre("Berna");
        cliente1.setEdad(15);
        cliente1.setDireccion("Pachuca 50");
        System.out.println(cliente1);
        //fin
    }
}
