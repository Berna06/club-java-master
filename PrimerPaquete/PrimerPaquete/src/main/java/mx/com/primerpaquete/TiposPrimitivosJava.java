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
public class TiposPrimitivosJava {

    public static void main(String[] args) {
//los tipos primitivos que se presentaran a acontinuacion son los siguientes 
//byte, short, int, long 
        System.out.println("Byte:");
        byte biteVar = 127;
        System.out.println("biteVar = " + biteVar);
        System.out.println("bits tipo byte:" + Byte.SIZE);/*cuanto byte soporta*/
        System.out.println("bytes tipo bytes:" + Byte.BYTES);
        System.out.println("Valor minimo tipo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo tipo byte:" + Byte.MAX_VALUE);
        /*son valores que pueden soportar por ello si ponemos un numero 
        maximo a 127 marcara un error ya que ese es su valor que puede alcanzar
         */
        System.out.println("short:");
        short shortVar = 32767;
        System.out.println("shortVar = " + shortVar);
        System.out.println("bits tipo short:" + Short.SIZE);/*cuanto byte soporta*/
        System.out.println("bytes tipo short:" + Short.BYTES);
        System.out.println("Valor minimo tipo short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo tipo short:" + Short.MAX_VALUE);

        System.out.println("tipo entero (int):");
        int intVar = 2147403647;
        System.out.println("intVar = " + intVar);
        System.out.println("bits tipo int:" + Integer.SIZE);/*cuanto byte soporta*/
        System.out.println("bytes tipo int:" + Integer.BYTES);
        System.out.println("Valor minimo tipo int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo tipo int:" + Integer.MAX_VALUE);

        System.out.println("tipo LONG:");
        long longVar = 100;
        System.out.println("longVar = " + longVar);
        System.out.println("bits tipo Long:" + Long.SIZE);/*cuanto byte soporta*/
        System.out.println("bytes tipo Long:" + Long.BYTES);
        System.out.println("Valor minimo tipo Long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo tipo Long:" + Long.MAX_VALUE);

        var numero = 10;
        System.out.println("numero = " + numero);
        /*en java se ocupan las siguentes conveeciones de numeros binarios(0b)
        octagonal(0)decimal(0x)
         */
        int numeroDecimal = 10;
        System.out.println("numeroDecimal = " + numeroDecimal);
        int numeroOctal = 012;
        /*para definir su variable de cada uno hay que poner su valor antes de 
        escribir el numero
         */
        System.out.println("numeroOctal = " + numeroOctal);
        int numeroHexadecimal = 0xA;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
        int numeroBinario = 0b1010;
        System.out.println("numeroBinario = " + numeroBinario);

        float floatVar = 1000.10f;
        System.out.println("floatVar = " + floatVar);
        System.out.println("bits tipo float:" + Float.SIZE);
        System.out.println("bytes tipo float:" + Float.BYTES);
        System.out.println("Valor minimo tipo float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float:" + Float.MAX_VALUE);
        double doubleVar = 100.10d;
        System.out.println("doubleVar = " + doubleVar);
        System.out.println("bits tipo double:" + Double.SIZE);
        System.out.println("bytes tipo double:" + Double.BYTES);
        System.out.println("Valor minimo tipo double:" + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double:" + Double.MAX_VALUE);

        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        System.out.println("bits tipo char:" + Character.SIZE);
        System.out.println("bytes tipo char:" + Character.BYTES);
        System.out.println("Valor minimo tipo char:" + Character.MIN_VALUE);
        System.out.println("Valor maximo tipo char:" + Character.MAX_VALUE);
        char varChatDecimal = 33;
        System.out.println("varChatDecimal = " + varChatDecimal);
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        /*son caracteres llamados unicodes los cuales solo pone simbolos*/
        //boolean
        System.out.println("true tipo boolean:" + Boolean.TRUE);
        System.out.println("False tipo boolean:" + Boolean.FALSE);
        boolean booleanVar = true;
        if (booleanVar) {
            System.out.println("el valor es verdadero");
        } else {
            System.out.println("el valor es falso");
        }
        System.out.println("");
        var edad = 10;
        var esAdulto = edad >= 18;
        System.out.println("esAdulto = " + esAdulto);

        //CONVERCION
        var adulto = Integer.parseInt("20");
        System.out.println("adulto = " + adulto);
        double valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        char c = "hola".charAt(0);
        System.out.println("c = " + c);

        var scanner = new Scanner(System.in);
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("edad = " + edad);

        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);

        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);

        short s = 10;
        byte b = (byte) s;
        System.out.println("b = " + b);

    }

}
