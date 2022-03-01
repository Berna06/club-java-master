/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionJava;

/**
 *
 * @author bernardo
 */
public class Prueba114 {

    public static void main(String[] args) {
        //valores de Enumeracionesacion
        System.out.println("Valor1:" + ManejoDeEnumeraciones.LUNES);
        System.out.println("Valor2:" + ManejoDeEnumeraciones.MARTES);
        System.out.println("Valor3:" + ManejoDeEnumeraciones.MIERCOLES);
        System.out.println("Valor4:" + ManejoDeEnumeraciones.JUEVES);
        System.out.println("Valor5:" + ManejoDeEnumeraciones.VIERNES);
        System.out.println("Valor6:" + ManejoDeEnumeraciones.SABADO);
        System.out.println("Valor7:" + ManejoDeEnumeraciones.DOMINGO);
        System.out.println("Valor8:" + ManejoDeEnumeraciones.DIAINEXISTENTE);
        //enumeraciones con paises 
        System.out.println("pais " + Paises114.CHIAPAS);
        System.out.println("Carteles de la mafia: " + Paises114.CHIAPAS.getPaises());
        System.out.println("Pais:" + Paises114.JALISCO);
        System.out.println("Carteles de la mafia: " + Paises114.JALISCO.getPaises());
        System.out.println("Pais" + Paises114.MEXICO);
        System.out.println("Carteles de la mafia;" + Paises114.MEXICO.getPaises());
        System.out.println("Pais:" + Paises114.NVOLEON);
        System.out.println("Carteles de la mafia;" + Paises114.NVOLEON.getPaises());
        System.out.println("Pais: " + Paises114.SANANDREAS);
        System.out.println("Carteles de la mafia: " + Paises114.SANANDREAS.getPaises());

        indicarDia(ManejoDeEnumeraciones.DOMINGO);
    }

    private static void indicarDia(ManejoDeEnumeraciones dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
            case DOMINGO:
                System.out.println("Ultimo dia de la semana");

        }
    }
}
