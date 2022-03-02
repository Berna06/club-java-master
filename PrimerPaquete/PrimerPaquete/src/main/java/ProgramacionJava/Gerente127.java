/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionJava;

/**
 *
 * @author bernardo
 */
public class Gerente127 extends Empleado127 {

    private String departamento;

    public Gerente127(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //sobreescribimos el metodo padre heredaro
    public String obtenerDetalles() {
        return "Nombre: " + nombre + "Sueldo: " + "Departamento: " + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
