/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

import java.util.Scanner;

/**
 *
 * @author bernardo
 */
public class SetenciasDeControl {

    //inicio 51 min
    public static void main(String[] args) {
        // if else part 1
        var condicion = true;
        if (condicion) {
            System.out.println("condicion verdadera");
        } else {
            System.out.println("condicion falsa");
        }

        var numero = 2;
        var numeroTexto = "numero desconocido";
        if (numero == 1) {
            numeroTexto = "numero uno";
        } else if (numero == 2) {
            numeroTexto = "numero dos";
        } else if (numero == 3) {
            numeroTexto = "numeor tres";
        } else {
            numeroTexto = "valor desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        //if else part 2 
        var scanner = new Scanner(System.in);
        System.out.println("propociona el mes:");
        var mes = scanner.nextInt();//mes de los 12 meses
        String estacion = null;
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "vernano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "otoño";
        } else {
            estacion = "Mes incorrecto";
        }
        System.out.println("estacion = " + estacion + " para el mes:" + mes);

        // SWITCH
        var valor = 3;
        var valorTexto = "valor desconocido";
        switch (valor) {
            case 1:
                valorTexto = "valor 1";
                break;
            case 2:
                valorTexto = "valor 2";
                break;
            case 3:
                valorTexto = "valor 3";
                break;
            default: 
                valorTexto = "valor desconocido";

        }
        System.out.println("valor texto:" + valorTexto + " para el numero propocionado:" + valor) ;
        
        //switch part 2 
        var scaneo = new Scanner(System.in);
        System.out.println("propociona el numero:");
        var mess = scanner.nextInt();
        String temperatura = null;
        
        switch( mess ){
            case 1: case 2: case 12:
                temperatura = "frio";
                break;
            case 3: case 4: case 5:
                temperatura = "calida";
                break;             
            case 6: case 7: case 8:
                temperatura = "caliente";
                break;
            case 9: case 10: case 11:
                temperatura = "postfrio";
                break;
            default:
                temperatura="no hay temperatura";
        }
        System.out.println("estacion =" + estacion + " para el mes "+mes );
        //fin
    }

}
