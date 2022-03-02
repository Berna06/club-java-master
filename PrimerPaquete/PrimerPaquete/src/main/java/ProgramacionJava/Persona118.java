package ProgramacionJava;

public class Persona118 {

    private final int idPersona;
    private String nombre;
    private static int contadorPersonas;

    Persona118(String nombre) {
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona118{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

}
