
package ProgramacionJava;

import static ProgramacionJava.Operacion159.restar;
import java.util.Scanner;
import static mx.com.primerpaquete.SobreCarga.sumar;
public class Calculadora159 {
    public static void main(String[] args) {
        System.out.println("Propociona el primer valor: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Propociona el segundo valor; ");
        int b = scanner.nextInt();
        int resultado = sumar(a, b);
        System.out.println("El resultado de la suma es: " + resultado);
        
        System.out.println("Propociona el valor de la resta:");
        int c = scanner.nextInt();
        System.out.println("Propocioina el valor de la resta2:");
        int d = scanner.nextInt();
        int resultado2 = restar(c, d);
        System.out.println("El resultado de la rests es:" + resultado2);
    }
    
}
