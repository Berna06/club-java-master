/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class Aritmetica {

    //atributos de la clase
    int a;
    int b;

    public Aritmetica() {
        System.out.println("ejecutando contructor vacio");
    }

    public Aritmetica(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        System.out.println("Ejecutando contructor con dos argumentos");
    }

    //proyecto  CracionDeMetodos
    public int sumar() {
        return a + b;
    }
    
    public int restar(){
        return a - b;
    }
    public int mutiplicar(){
        return a * b;
    }
    public int dividir(){
        return a/b;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
