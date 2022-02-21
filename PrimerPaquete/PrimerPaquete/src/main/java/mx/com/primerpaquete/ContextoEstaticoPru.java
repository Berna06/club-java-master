/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class ContextoEstaticoPru {
    
    public static void main(String[] args) {
        ContextoEstatico persona1 = new ContextoEstatico("Juan");
        System.out.println("persona1 = " + persona1);
        ContextoEstatico persona2 = new ContextoEstatico("Gomez");
        System.out.println("persona2 = " + persona2);
        ContextoEstatico persona3 = new  ContextoEstatico("Jorge");
        System.out.println("persona3 = " + persona3);
        System.out.println("contadorPersonas:" + ContextoEstatico.contadorPersonas());
        
    }
    
}
