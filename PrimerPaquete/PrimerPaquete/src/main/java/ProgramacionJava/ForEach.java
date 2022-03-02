package ProgramacionJava;

public class ForEach {

    public static void main(String[] args) {
        int edades[] = {15, 30, 45, 60};
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }
        Persona118 personas[] = {new Persona118("Colio"), new Persona118("Ganstar")};
        System.out.println("");
        for (Persona118 persona : personas) {
            System.out.println("persona = " + persona);
        }

    }

}
