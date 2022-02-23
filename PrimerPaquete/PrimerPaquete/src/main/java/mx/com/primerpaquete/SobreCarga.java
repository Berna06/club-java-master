/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class SobreCarga {

    //definimos primero el metodo suma 
    public static int sumar(int a, int b) {
        System.out.println("metodo sumar(int, int)");
        return a + b;
    }

    //si tiene distintos argumentos a este se le llama sobrecarga
    public static double sumar(double a, double b) {
        System.out.println("metodo sumar(double, double)");
        return a + b;
    }

    public static double sumar(int a, double b) {
        System.out.println("Metodo sumar (int, double)");
        return a + b;
    }

    public static double sumar(double a, int b) {
        System.out.println("Metodo sumar (double, int)");
        return a + b;
    }
    public static long sumar(int a, long b){
        System.out.println("Metodo sumar (int, long)");
        return a + b;
    }

}
