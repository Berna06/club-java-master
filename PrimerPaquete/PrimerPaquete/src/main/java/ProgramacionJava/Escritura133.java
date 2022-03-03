package ProgramacionJava;

public enum Escritura133 {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura a Digital"),
    FUTURISTA("Escritura Mental");
    private final String descripcion;

    private Escritura133(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

}
