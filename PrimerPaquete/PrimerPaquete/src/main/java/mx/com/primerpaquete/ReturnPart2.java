/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class ReturnPart2 {

    public static void main(String[] args) {
        Suma s = creaObjetoSuma();
        System.out.println("Resultado del metodo: " + s.sumar());

    }

    private static Suma creaObjetoSuma() {
        return new Suma(4, 6);
    }
}

class Suma {

    int a;
    int b;

    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sumar() {
        return this.a + this.b;
    }
}
