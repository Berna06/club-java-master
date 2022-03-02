package ProgramacionJava;

public class SobreEscritura {

    public static void main(String[] args) {
        Empleado127 empleado = new Empleado127("Carl ", 5000);
        System.out.println("empleado = " + empleado.obtenerDetalles());
        Gerente127 gerente = new Gerente127("Jonhson ", 3000 , "Finanzas");
        System.out.println("gerente = " + gerente.obtenerDetalles() );
        
    }

}
