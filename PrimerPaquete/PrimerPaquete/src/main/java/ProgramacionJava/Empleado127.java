package ProgramacionJava;

public class Empleado127 {

    protected String nombre;
    protected double sueldo;

    protected Empleado127(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    Empleado127(String carl) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String obtenerDetalles() {
        return "Nombre: " + this.nombre + "Sueldo: " + this.sueldo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
