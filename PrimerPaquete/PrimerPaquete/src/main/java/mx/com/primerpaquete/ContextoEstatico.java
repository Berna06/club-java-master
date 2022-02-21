/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class ContextoEstatico {

    private int idPersona;// se asocioa con un objeto 
    private String nombre;// se asocia con un objeto 
    private static int contadorPersonas;//se asocia con la clase 

    public ContextoEstatico(String nombre) {
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;

    }

    public int getIdPersona() {
        return this.idPersona;
    }
//    public void setIdPersona(int idPersona){
//        this.idPersona = idPersona;
//    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int contadorPersonas() {
        return contadorPersonas;
    }

    public String toString() {
        return "IdPersona:" + idPersona + ", nombre:" + nombre + ", contadorPersonas" + contadorPersonas;
    }
}
