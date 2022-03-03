package ProgramacionJava;

public class ClaseObject {

    public static void main(String[] args) {
        Empleado136 emp1 = new Empleado136("Juan", 1000);
        System.out.println("emp1 = " + emp1);
        Empleado136 emp2 = new Empleado136("Juan", 1000);
        System.out.println("emp2 = " + emp2);
        System.out.println("Objetos iguales: " + (emp1 == emp2));

        compararObjetos(emp1, emp2);
    }

    private static void compararObjetos(Empleado136 emp1, Empleado136 emp2) {
        System.out.println("emp1 = " + emp1);
        System.out.println("emp2 = " + emp2);
        //revicion por referencia 
        if (emp1 == emp2) {
            System.out.println("Los objetos tienen misma direccion de memoria: ");
        } else {
            System.out.println("No tienen igualdan zzz: ");
        }
        //revicion del metodo equals
        if (emp1.equals(emp2)) {
            System.out.println("Mismo contenido");
        } else {
            System.out.println("No es lo mismo :3");
        }
        //revicion del metodo hasdcode
        if (emp1.hashCode() == emp2.hashCode()) {
            System.out.println("Igualdad");
            System.out.println("emp1 = " + emp1.hashCode());
            System.out.println("emp2 = " + emp2.hashCode());
        } else {
            System.out.println("Desigualdad");
        }
    }

}
