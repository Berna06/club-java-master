package ProgramacionJava;

public class Escritor133 extends Empleado133 {

    final Escritura133 tipoEscritura;

    public Escritor133(String nombre, double sueldo, Escritura133 tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", tipo escritura: " + tipoEscritura.getDescripcion();
    }

    public Escritura133 getTipoEscritura() {
        return this.tipoEscritura;
    }

    public String getTipoDeEscrituraEnTexto() {
        return tipoEscritura.getDescripcion();
    }

}
