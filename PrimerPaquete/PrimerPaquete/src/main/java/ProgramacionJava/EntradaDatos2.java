package ProgramacionJava;

import java.util.Scanner;

public class EntradaDatos2 {
    
    public static void main(String[] args) {
        String captura = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un dato: ");
        captura = scanner.nextLine();
        while ("SALIR".equals(captura)) {
            System.out.println("Dato introducido = " + captura);
            captura = scanner.nextLine();
        }
    }
    
}
