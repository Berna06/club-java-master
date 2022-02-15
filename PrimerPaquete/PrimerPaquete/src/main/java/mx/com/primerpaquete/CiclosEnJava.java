/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;
/**
 *
 * @author bernardo
 */
public class CiclosEnJava {

    // 40 min section 8 
    public static void main(String[] args) {

        //CICLO WHILE / DO WHILE
        var contador = 0;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);

        //CICLO FOR
        for (var q = 0; q < 3; q++) {
            System.out.println("q = " + q);
        }

        //PALABRAS BREAK Y CONTINUE
        for (int i = 0; i < 3; i++) {
            //imprimimos solo los numeros pares 
            if (i % 2 == 0) {
                System.out.println("i = " + i);
                break;
            }
        }

        for (int i = 0; i < 3; i++) {
            //imprimimos solo los numeros pares 
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
        //USO DE ETIQUETAS 
        //se pone primero el ciclo para ver que ciclo solo afecta 
        //solo se usa en certificacion en java ya que es un poco complicado leer

        //fin
    }
}
