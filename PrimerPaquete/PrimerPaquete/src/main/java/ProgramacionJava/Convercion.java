package ProgramacionJava;

public class Convercion {

    public static void main(String[] args) {
        Empleado133 empleado;

        empleado = new Escritor133("Willian", 5000, Escritura133.CLASICO);

        //empleado.getTipoDeEscrituraEnTexto();
        System.out.println(empleado.obtenerDetalles());

        Escritor133 escritor = (Escritor133) empleado;

        System.out.println(escritor.getTipoDeEscrituraEnTexto());

        System.out.println(((Escritor133) empleado).getTipoDeEscrituraEnTexto());

        empleado = new Gerente133("Dafoe", 9500, "Sistemas");

        System.out.println(((Gerente133) empleado).getDepartamento());
    }
}
