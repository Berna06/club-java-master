package ProgramacionJava;

public class ClaseObject {

    public static void main(String[] args) {
        Empleado136 emp1 = new Empleado136("Juan", 1000);
        System.out.println("emp1 = " + emp1);
        Empleado136 emp2 = new Empleado136("Juan", 1000);
        System.out.println("emp2 = " + emp2);
        System.out.println("Objetos iguales: " + (emp1 == emp2));
        
    }

}
