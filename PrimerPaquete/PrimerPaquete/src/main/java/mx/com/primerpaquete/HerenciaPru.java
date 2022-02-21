/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class HerenciaPru extends Herencia{
    private int idEmpleado;
    private double Sueldo;
    private static int contadorEmpleado;
    
    public HerenciaPru(String nombre, double sueldo){
        super(nombre);
        this.idEmpleado =++contadorEmpleado;
        this.Sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public String toString() {
        return super.toString() +"HerenciaPru{" + "idEmpleado=" + idEmpleado + ", Sueldo=" + Sueldo + '}';
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
            
}
