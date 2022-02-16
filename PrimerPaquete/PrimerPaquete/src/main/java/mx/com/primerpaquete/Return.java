/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class Return {

    //tipos primitivos
    public static void main(String[] args) {
        sumarSinRetonarValor(3, 6);
        sunarRetonandoValor(4, 2);
        String resultado = null;
        System.out.println("sumar retonando valor = " + resultado);

    }

    private static void sumarSinRetonarValor(int a, int b) {
        System.out.println("Resultado de sumar sin retonar valor:" + (a + b));
        return;//opcional 1
    }

    private static int sunarRetonandoValor(int a, int b) {
        return a + b;
       
    }

}
