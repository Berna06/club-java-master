/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class This {

    public static void main(String[] args) {
        Persona persona = new Persona("juan");
    }
}

class Persona {

    String nombre;//atributo de la clase 

    Persona(String nombre) {
        this.nombre = nombre;//this es le nombre del objeto actual 
        System.out.println("inpresion del operador thisdentro de la clase persona" + this);
        //apunta al objeto de tipo persona 
        //imprimimos el objeto persona 
        imprimir imprimir = new imprimir();
        imprimir.imprimir(this);//this contiene una referencia al tipo persona 
    }
}

class imprimir {

    public void imprimir(Persona p) {
        System.out.println("imprimir parametro:" + p);
        System.out.println("imprimir objeto actual(this)" + this);
    }
}
