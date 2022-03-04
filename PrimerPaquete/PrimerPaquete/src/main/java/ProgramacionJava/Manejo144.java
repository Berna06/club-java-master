package ProgramacionJava;

public class Manejo144 {

    public static void main(String[] args) {
        Persona144 bean = new Persona144();
        bean.getNombre("Juan");
        bean.getEdad(28);
        System.out.println("Nombre = " + bean.getNombre());
        System.out.println("Edad = " + bean.getEdad());
        
    }
}
