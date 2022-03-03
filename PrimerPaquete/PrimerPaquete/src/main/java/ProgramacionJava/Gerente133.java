package ProgramacionJava;

public class Gerente133 extends Empleado133 {

    private String departamento;

    public Gerente133(String nombre, double sueldo, String departamento) {
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
