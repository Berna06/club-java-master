/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class AlcanzeDeVariables {

    //se seguira trabajando en el proyeccto de arictmetica
    //y este sera la clase de prueba xdxdxddx
    public static void main(String[] args) {
        //variables local
        int operandoA = 6;
        int operandoB = 2;
        //crecamos un onjeto de la clase aritmetica enviando argumentos 
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);

        //imprimimos los valores de los operandos 
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        //imprimimos el resultado de la suma 
        System.out.println("\nResultado de la suma:" + objeto1.sumar());

        //imprimimos el resultado de resta 
        System.out.println("\nResultado de la resta:" + objeto1.restar());

        //imprimimos el resultado de mutiplicacion 
        System.out.println("\nResultado de la multiplicacion:" + objeto1.mutiplicar());

        //impimos el resultaod de la divicion
        System.out.println("\nResultado de la divicion:" + objeto1.dividir());
        //fin
    }

}
