/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class CreacionMetodos2 {

    public static void main(String[] args) {

        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 10;
        aritmetica.b = 3;
        int resultado = aritmetica.sumar();
        System.out.println("resultado = " + resultado);

        //creacion de un segundo objeto Aritmetica
        Aritmetica aritmetica2 = new Aritmetica(4, 2);
        System.out.println("resultado2: " + aritmetica2.sumar());
        
        
    }

}
